package com.bbh.shop.provider.service;

import com.bbh.shop.api.entity.Admin;
import com.bbh.shop.api.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
@Transactional
public class AdminServiceImpl  {
   @Autowired
   private Mapper<Admin>  mapper;
    @Transactional(readOnly = true)
    public boolean usernameExists(String username) {
        Example example = new Example(Admin.class);
        example.createCriteria().andEqualTo("username", username);
        int count = mapper.selectCountByExample(example);
        return count > 0 ? true : false;
    }

    @Transactional(readOnly = true)
    public Admin findByUsername(String username) {
        Example example = new Example(Admin.class);
        example.createCriteria().andEqualTo("username", username);
        List<Admin> list = mapper.selectByExample(example);
        return null != list && list.size() > 0 ? list.get(0) : null;
    }

    @Transactional(readOnly = true)
    public List<String> findAuthorities(String id) {
       /* List<String> authorities = new ArrayList<String>();
        Admin admin = mapper.selectByPrimaryKey(id);
        if (admin != null) {
            for (Role role : admin.getRoles()) {
                authorities.addAll(role.getAuthorities());
            }
        }*/
        return null;
    }

    /*
     @Transactional(readOnly = true)
     public boolean isAuthenticated() {
     Subject subject = SecurityUtils.getSubject();
     if (subject != null) {
     return subject.isAuthenticated();
     }
     return false;
     }

     @Transactional(readOnly = true)
     public Manage getCurrent() {
     Subject subject = SecurityUtils.getSubject();
     if (subject != null) {
     Principal principal = (Principal) subject.getPrincipal();
     if (principal != null) {
     return mapper.find(principal.getId());
     }
     }
     return null;
     }

     @Transactional(readOnly = true)
     public String getCurrentUsername() {
     Subject subject = SecurityUtils.getSubject();
     if (subject != null) {
     Principal principal = (Principal) subject.getPrincipal();
     if (principal != null) {
     return principal.getUsername();
     }
     }
     return null;
     }*/



}