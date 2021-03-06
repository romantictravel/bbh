package com.bbh.shop.api.entity;

import javax.persistence.*;

@Table(name = "tb_admin_role")
public class AdminRole {
    @Id
    private Long admins;

    @Id
    private Long roles;

    /**
     * @return admins
     */
    public Long getAdmins() {
        return admins;
    }

    /**
     * @param admins
     */
    public void setAdmins(Long admins) {
        this.admins = admins;
    }

    /**
     * @return roles
     */
    public Long getRoles() {
        return roles;
    }

    /**
     * @param roles
     */
    public void setRoles(Long roles) {
        this.roles = roles;
    }
}