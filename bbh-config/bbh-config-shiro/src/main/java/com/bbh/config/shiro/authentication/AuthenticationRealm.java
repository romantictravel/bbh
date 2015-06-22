package com.bbh.config.shiro.authentication;
import com.bbh.common.utils.captcha.service.CaptchaService;
import com.bbh.common.utils.settings.Setting;
import com.bbh.common.utils.settings.Setting.CaptchaType;
import com.bbh.common.utils.settings.SettingUtils;
import com.bbh.config.shiro.entity.Account;
import com.bbh.config.shiro.entity.Principal;
import com.bbh.config.shiro.service.AccountService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * 权限认证
 *
 * @author bbh Team
 * @version 1.0
 */
public class AuthenticationRealm extends AuthorizingRealm {
    @Autowired
    private CaptchaService captchaService;
    @Autowired
    private AccountService accountService;


    /**
     * 获取认证信息
     *
     * @param token 令牌
     * @return 认证信息
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken token) {
        AuthenticationToken authenticationToken = (AuthenticationToken) token;
        String username = authenticationToken.getUsername();
        String password = new String(authenticationToken.getPassword());
        String captchaId = authenticationToken.getCaptchaId();
        String captcha = authenticationToken.getCaptcha();
        String ip = authenticationToken.getHost();
        Setting setting= SettingUtils.get();
        if (!captchaService.isValid(CaptchaType.adminLogin, captchaId, captcha)) {
            throw new UnsupportedTokenException();
        }
        if (username != null && password != null) {
            Account account = accountService.findByUsername(username);
            if (account == null) {
                throw new UnknownAccountException();
            }
            if (!account.getIsEnabled()) {
                throw new DisabledAccountException();
            }
            if (account.getIsLocked()) {
                if (ArrayUtils.contains(setting.getAccountLockTypes(), Setting.AccountLockType.admin)) {
                    int loginFailureLockTime = setting.getAccountLockTime();
                    if (loginFailureLockTime == 0) {
                        throw new LockedAccountException();
                    }
                    Date lockedDate = account.getLockedDate();
                    Date unlockDate = DateUtils.addMinutes(lockedDate, loginFailureLockTime);
                    if (new Date().after(unlockDate)) {
                        account.setLoginFailureCount(0);
                        account.setIsLocked(false);
                        account.setLockedDate(null);
                        accountService.updateAccount(account);
                    } else {
                        throw new LockedAccountException();
                    }
                } else {
                    account.setLoginFailureCount(0);
                    account.setIsLocked(false);
                    account.setLockedDate(null);
                    accountService.updateAccount(account);
                }
            }
            if (!DigestUtils.md5Hex(password).equals(account.getPassword())) {
                int loginFailureCount = account.getLoginFailureCount() + 1;
                if (loginFailureCount >= setting.getAccountLockCount()) {
                    account.setIsLocked(true);
                    account.setLockedDate(new Date());
                }
                account.setLoginFailureCount(loginFailureCount);
                accountService.updateAccount(account);
                throw new IncorrectCredentialsException();
            }
            account.setLoginIp(ip);
            account.setLoginDate(new Date());
            account.setLoginFailureCount(0);
            accountService.updateAccount(account);
            return new SimpleAuthenticationInfo(new Principal(account.getId(), username), password, getName());
        }
        throw new UnknownAccountException();
    }

    /**
     * 获取授权信息
     *
     * @param principals principals
     * @return 授权信息
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Principal principal = (Principal) principals.fromRealm(getName()).iterator().next();
        if (principal != null) {
            List<String> authorities = accountService.findAuthorities(principal.getId());
            if (authorities != null) {
                SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
                authorizationInfo.addStringPermissions(authorities);
                return authorizationInfo;
            }
        }
        return null;
    }

}