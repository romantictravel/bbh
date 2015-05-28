package com.bbh.shop.api.service;

import com.bbh.shop.api.entity.Manage;

/**
 * @author BBH TEAM
 * @Description
 * @Date: 2015/5/3
 * @Version:1.0.0
 */
public interface ManageService {


    public boolean usernameExists(String username) ;

    public Manage findByUsername(String username);

    public void save(Manage manage);


    public int update(Manage manage);

    public void delete(Long id);


    public void delete(Long... ids);

}
