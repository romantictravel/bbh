package com.bbh.shiro.core;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "shiro")
public class ShiroSettings {
    private String defaultPermissionString;
    private String defaultRoleString;
    private String authorizationCacheName;
    private String authenticationCacheName;
    private String casServerUrlPrefix;
    private String loginUrl;
    private String logoutUrl;
    private String serviceUrl;
    private String successUrl;
    private String errorUrl;
    private String unauthorizedUrl;
    private String filterChainDefinitions;
    private String appCode;

    public String getDefaultPermissionString() {
        return this.defaultPermissionString;
    }

    public void setDefaultPermissionString(String defaultPermissionString) {
        this.defaultPermissionString = defaultPermissionString;
    }

    public String getDefaultRoleString() {
        return this.defaultRoleString;
    }

    public void setDefaultRoleString(String defaultRoleString) {
        this.defaultRoleString = defaultRoleString;
    }

    public String getAuthorizationCacheName() {
        return this.authorizationCacheName;
    }

    public void setAuthorizationCacheName(String authorizationCacheName) {
        this.authorizationCacheName = authorizationCacheName;
    }

    public String getAuthenticationCacheName() {
        return this.authenticationCacheName;
    }

    public void setAuthenticationCacheName(String authenticationCacheName) {
        this.authenticationCacheName = authenticationCacheName;
    }

    public String getCasServerUrlPrefix() {
        return this.casServerUrlPrefix;
    }

    public void setCasServerUrlPrefix(String casServerUrlPrefix) {
        this.casServerUrlPrefix = casServerUrlPrefix;
    }

    public String getLoginUrl() {
        return this.loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getLogoutUrl() {
        return this.logoutUrl;
    }

    public void setLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    public String getServiceUrl() {
        return this.serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public String getSuccessUrl() {
        return this.successUrl;
    }

    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    public String getErrorUrl() {
        return this.errorUrl;
    }

    public void setErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
    }

    public String getUnauthorizedUrl() {
        return this.unauthorizedUrl;
    }

    public void setUnauthorizedUrl(String unauthorizedUrl) {
        this.unauthorizedUrl = unauthorizedUrl;
    }

    public String getFilterChainDefinitions() {
        return this.filterChainDefinitions;
    }

    public void setFilterChainDefinitions(String filterChainDefinitions) {
        this.filterChainDefinitions = filterChainDefinitions;
    }

    public String getAppCode() {
        return this.appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }
}
