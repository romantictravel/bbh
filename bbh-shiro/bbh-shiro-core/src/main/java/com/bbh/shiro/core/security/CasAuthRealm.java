package com.bbh.shiro.core.security;

import com.bbh.shiro.core.ShiroSettings;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import com.bbh.shiro.core.context.SessionVariable;
import com.hyxt.data.rbac.service.AccountService;
import com.hyxt.data.rbac.vo.ResourceVo;
import com.hyxt.data.rbac.vo.RoleVo;
import com.hyxt.data.rbac.vo.UserVo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cas.CasRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.util.Assert;

public class CasAuthRealm extends CasRealm {
    private List<String> defaultPermission = Lists.newArrayList();

    private List<String> defaultRole = Lists.newArrayList();
    private AccountService accountService;
    private ShiroSettings shiroSettings;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void setShiroSettings(ShiroSettings shiroSettings) {
        this.shiroSettings = shiroSettings;
    }

    public void setDefaultPermissionString(String defaultPermissionString) {
        String[] perms = StringUtils.split(defaultPermissionString, ",");
        CollectionUtils.addAll(this.defaultPermission, perms);
    }

    public void setDefaultRoleString(String defaultRoleString) {
        String[] roles = StringUtils.split(defaultRoleString, ",");
        CollectionUtils.addAll(this.defaultRole, roles);
    }

    public void setDefaultPermission(List<String> defaultPermission) {
        this.defaultPermission = defaultPermission;
    }

    public void setDefaultRole(List<String> defaultRole) {
        this.defaultRole = defaultRole;
    }

    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        super.doGetAuthenticationInfo(token);
        UserVo user = this.accountService.findUserByUserId(token.getPrincipal().toString());

        SessionVariable sessionVariable = new SessionVariable();
        sessionVariable.setUser(user);
        return new SimpleAuthenticationInfo(new SimplePrincipalCollection(sessionVariable, getName()), token.getCredentials());
    }

    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SessionVariable sessionVariable = (SessionVariable) principals.getPrimaryPrincipal();

        Assert.notNull(sessionVariable, "用户主体为空");

        List resourceList = new ArrayList();
        for (RoleVo roleVo : sessionVariable.getUser().getRoles()) {
            resourceList.addAll(roleVo.getResources());
        }

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        addPermissions(info, resourceList);

        this.defaultRole.addAll(sessionVariable.getRoleNames());
        info.addRoles(this.defaultRole);

        return info;
    }

    private void addPermissions(SimpleAuthorizationInfo info, List<ResourceVo> resources) {
        Iterable filterResources = Iterables.filter(resources, new Predicate<ResourceVo>() {
            public boolean apply(ResourceVo input) {
                if ((StringUtils.isEmpty(input.getPermission())) || (StringUtils.isEmpty(input.getValue()))) {
                    return false;
                }

                if (CasAuthRealm.this.shiroSettings.getAppCode() == null) {
                    return true;
                }
                return StringUtils.equals(input.getAppCode(), CasAuthRealm.this.shiroSettings.getAppCode());
            }
        });
        Iterable temp = Iterables.transform(filterResources, new Function() {
            public String apply(ResourceVo input) {
                return input.getPermission();
            }
        });
        List permissions = getValue(temp, "perms\\[(.*?)\\]");

        if (CollectionUtils.isNotEmpty(this.defaultPermission)) {
            CollectionUtils.addAll(permissions, this.defaultPermission.iterator());
        }

        info.addStringPermissions(permissions);
    }

    private List<String> getValue(Iterable<String> obj, String regex) {
        List result = new ArrayList();

        if (Iterables.isEmpty(obj)) {
            return result;
        }

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(StringUtils.join(obj, ","));

        while (matcher.find()) {
            result.add(matcher.group(1));
        }

        return result;
    }
}
