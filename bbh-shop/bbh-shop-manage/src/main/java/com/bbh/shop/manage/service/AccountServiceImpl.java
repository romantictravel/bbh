package com.bbh.shop.manage.service;

import com.bbh.config.shiro.entity.Account;
import com.bbh.config.shiro.service.AccountService;
import com.bbh.shop.api.entity.Admin;
import com.bbh.shop.api.service.AdminService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by roman_000 on 2015/6/7.
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AdminService adminService;

    @Override
    public Account findByUsername(String username) {
        Account account = new Account();
        Admin admin = adminService.findByUsername(username);
        BeanUtils.copyProperties(admin, account);
        return account;
    }

    @Override
    public void updateAccount(Account account) {
         Admin admin  = new Admin();
         BeanUtils.copyProperties(account,admin);
         adminService.update(admin);
    }

    @Override
    public List<String> findAuthorities(Long id) {
        return adminService.findAuthorities(id);
    }
}
