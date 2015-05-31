package com.bbh.shop.api.service;

import com.bbh.shop.api.entity.Manage;

import java.util.List;

/**
 * @author BBH TEAM
 * @Description
 * @Date: 2015/5/3
 * @Version:1.0.0
 */
public interface ManageService {


     boolean usernameExists(String username) ;

     Manage findByUsername(String username);

     void save(Manage manage);

     int update(Manage manage);

     void delete(String id);

     void delete(String... ids);

    /**
     * 查找权限集合
     * @param id
     * @return
     */
     List<String> findAuthorities(String id);


}
