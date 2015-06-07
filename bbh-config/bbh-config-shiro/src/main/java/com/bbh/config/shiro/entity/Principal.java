package com.bbh.config.shiro.entity;
import java.io.Serializable;

/**
 * 身份信息
 *
 * @author BBH Team
 * @version 1.0
 */
public class Principal implements Serializable {

    private static final long serialVersionUID = 5798882004228239559L;

    /**
     * ID
     */
    private String id;
    /**
     * 微信openId
     */
    private String openId;
    /**
     * 微信unionId
     */
    private String unionId;

    /**
     * 用户名
     */
    private String username;

    /**
     * @param id       ID
     * @param username 用户名
     */
    public Principal(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public Principal(String id, String username,String openId,String unionId) {
        this.id = id;
        this.username = username;
        this.openId=openId;
        this.unionId=unionId;
    }

    /**
     * 获取ID
     *
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return username;
    }

}