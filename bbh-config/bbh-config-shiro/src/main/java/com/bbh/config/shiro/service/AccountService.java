package com.bbh.config.shiro.service;

import com.bbh.config.shiro.entity.Account;

import java.util.List;

/**
 * Created by roman_000 on 2015/6/7.
 */
public interface AccountService {

    Account findByUsername(String username);

    void   updateAccount(Account account);

    List<String> findAuthorities(Long id);
}
