package com.bbh.shop.manage.service;

import com.bbh.config.shiro.entity.Account;
import com.bbh.config.shiro.service.AccountService;
import com.bbh.shop.api.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by roman_000 on 2015/6/7.
 */
@Service
public class AccountImpl implements AccountService {
    @Autowired
    private ManageService manageService;
    @Override
    public Account findByUsername(String username) {
        return null;
    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public List<String> findAuthorities(String id) {
        return null;
    }
}
