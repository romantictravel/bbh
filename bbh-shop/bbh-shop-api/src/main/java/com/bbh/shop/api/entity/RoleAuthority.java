package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_role_authority")
public class RoleAuthority {
    private String role;

    private String authorities;

    /**
     * @return role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * @return authorities
     */
    public String getAuthorities() {
        return authorities;
    }

    /**
     * @param authorities
     */
    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }
}