package com.bbh.shop.api.service;

import com.bbh.shop.api.entity.Admin;

import java.util.List;

/**
 * @author BBH TEAM
 * @Description
 * @Date: 2015/5/3
 * @Version:1.0.0
 */
public interface AdminService extends BaseService<Admin> {

    boolean usernameExists(String username);

    Admin findByUsername(String username);

    public List<String> findAuthorities(Long id);

    boolean isAuthenticated();


}
