package com.bbh.shop.service;

import com.bbh.shop.entity.Manage;
import com.bbh.shop.repository.ManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ManageServiceImpl implements ManageService {
   // @Autowired
    private ManageMapper manageMapper;

    public boolean usernameExists(String username) {
        ManageCondition condition=new ManageCondition();
        ManageCondition.Criteria criteria=condition.createCriteria();
        criteria.andUsernameEqualTo(username);
        int count= manageMapper.countByExample(condition);
        return count>0?true:false;
    }

    public Manage findByUsername(String username) {
        ManageCondition condition=new ManageCondition();
        ManageCondition.Criteria criteria=condition.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<Manage> list=manageMapper.selectByExample(condition);
        return  null!=list&&list.size()>0?list.get(0):null;
    }
    /**
    public List<String> findAuthorities(Long id) {
        List<String> authorities = new ArrayList<String>();
        Manage manage = manageMapper.selectByPrimaryKey(id);
        if (manage != null) {
            for (Role role : manage.getRoles()) {
                authorities.addAll(role.getAuthorities());
            }
        }
        return authorities;
    }


    public boolean isAuthenticated() {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            return subject.isAuthenticated();
        }
        return false;
    }

  
    public Manage getCurrent() {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            Principal principal = (Principal) subject.getPrincipal();
            if (principal != null) {
                return manageMapper.find(principal.getId());
            }
        }
        return null;
    }

   
    public String getCurrentUsername() {
        Subject subject = SecurityUtils.getSubject();
        if (subject != null) {
            Principal principal = (Principal) subject.getPrincipal();
            if (principal != null) {
                return principal.getUsername();
            }
        }
        return null;
    }

    **/
    public void save(Manage manage) {
        manageMapper.insertSelective(manage);
    }

   
    public int update(Manage manage) {
        return  manageMapper.updateByPrimaryKeySelective(manage);
    }

    public void delete(Long id) {
        manageMapper.deleteByPrimaryKey(id);
    }


    public void delete(Long... ids) {
        if(ids!=null&&ids.length>0){
            for(int i=0;i<ids.length;i++){
                manageMapper.deleteByPrimaryKey(ids[i]);
            }
        }

    }


    public void delete(ManageCondition condition) {
        manageMapper.deleteByExample(condition);
    }

}