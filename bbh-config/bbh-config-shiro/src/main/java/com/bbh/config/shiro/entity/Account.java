package com.bbh.config.shiro.entity;

import java.util.Date;

/**
 * Created by roman_000 on 2015/6/7.
 */
public class Account {
    private String  id;
    /** 用户名 */
    private String username;
    /**微信openId*/
    private String openId;
    /**微信unionId*/
    private String unionId;
    /** 密码 */
    private String password;
    /** 是否启用 */
    private Boolean isEnabled;
    /** 是否锁定 */
    private Boolean isLocked;
    /** 连续登录失败次数 */
    private Integer loginFailureCount;
    /** 锁定日期 */
    private Date lockedDate;
    /** 最后登录日期 */
    private Date loginDate;
    /** 最后登录IP */
    private String loginIp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    public Date getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }
}
