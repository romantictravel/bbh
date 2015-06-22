package com.bbh.shop.api.service;

import com.bbh.shop.api.entity.Admin;
import com.bbh.shop.api.entity.Role;

import java.util.List;

/**
 * Created by roman_000 on 2015/6/21.
 */
public interface RoleService extends BaseService<Admin>{

    List<Role> findAll();

    Role findId(String id);
}
