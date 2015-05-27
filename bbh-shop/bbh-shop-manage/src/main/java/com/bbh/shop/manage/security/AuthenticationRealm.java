/*



 */
package com.bbh.shop.manage.security;

import com.bbh.shop.service.ManageService;
import com.bbh.shop.entity.Manage;
import com.bbh.shop.manage.common.captcha.CaptchaService;
import com.bbh.shop.manage.common.Setting;
import com.bbh.shop.manage.common.Setting.AccountLockType;
import com.bbh.shop.manage.common.Setting.CaptchaType;
import com.bbh.shop.manage.common.SettingUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 权限认证
 * 
 * @author KCSHOP Team
 * @version 3.0
 */
public class AuthenticationRealm extends AuthorizingRealm {
	//@Autowired
	private ManageService manageService;
	//@Autowired
    private CaptchaService    captchaService;

	public ManageService getManageService() {
		return manageService;
	}

	public void setManageService(ManageService manageService) {
		this.manageService = manageService;
	}

	/**
	 * 获取认证信息
	 *

	 * @param token
	 *            令牌
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
		if (!captchaService.isValid(CaptchaType.manageLogin, captchaId, captcha)) {
			throw new UnsupportedTokenException();
		}
		if (username != null && password != null) {
			Manage manage = manageService.findByUsername(username);
			if (manage == null) {
				throw new UnknownAccountException();
			}
			if (!manage.getIsEnabled()) {
				throw new DisabledAccountException();
			}
			Setting setting = SettingUtils.get();
			if (manage.getIsLocked()) {
				if (ArrayUtils.contains(setting.getAccountLockTypes(), AccountLockType.manage)) {
					int loginFailureLockTime = setting.getAccountLockTime();
					if (loginFailureLockTime == 0) {
						throw new LockedAccountException();
					}
					Date lockedDate = manage.getLockedDate();
					Date unlockDate = DateUtils.addMinutes(lockedDate, loginFailureLockTime);
					if (new Date().after(unlockDate)) {
						manage.setLoginFailureCount(0);
						manage.setIsLocked(false);
						manage.setLockedDate(null);
						manageService.update(manage);
					} else {
						throw new LockedAccountException();
					}
				} else {
					manage.setLoginFailureCount(0);
					manage.setIsLocked(false);
					manage.setLockedDate(null);
					manageService.update(manage);
				}
			}
			if (!DigestUtils.md5Hex(password).equals(manage.getPassword())) {
				int loginFailureCount = manage.getLoginFailureCount() + 1;
				if (loginFailureCount >= setting.getAccountLockCount()) {
					manage.setIsLocked(true);
					manage.setLockedDate(new Date());
				}
				manage.setLoginFailureCount(loginFailureCount);
				manageService.update(manage);
				throw new IncorrectCredentialsException();
			}
			manage.setLoginIp(ip);
			manage.setLoginDate(new Date());
			manage.setLoginFailureCount(0);
			manageService.update(manage);
			return new SimpleAuthenticationInfo(new Principal(manage.getId(), username), password, getName());
		}
		throw new UnknownAccountException();

	}

	/**
	 * 获取授权信息
	 * 
	 * @param principals
	 *            principals
	 * @return 授权信息
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		Principal principal = (Principal) principals.fromRealm(getName()).iterator().next();
		/**
		if (principal != null) {
			List<String> authorities = manageService.findAuthorities(principal.getId());
			if (authorities != null) {
				SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
				authorizationInfo.addStringPermissions(authorities);
				return authorizationInfo;
			}
		}
		 **/
		return null;
	}

}