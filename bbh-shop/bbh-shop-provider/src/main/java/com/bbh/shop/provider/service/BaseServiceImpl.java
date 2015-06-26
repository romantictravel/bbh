package com.bbh.shop.provider.service;
import com.bbh.shop.api.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by tc 2014/12/11.
 */
@Service
public  class BaseServiceImpl<T> implements BaseService<T> {

    protected Logger logger= LoggerFactory.getLogger(this.getClass());

    @Autowired
    public Mapper<T> mapper;

    public int save(T entity){
        return mapper.insert(entity);
    }

    public int delete(T entity){
        return mapper.deleteByPrimaryKey(entity);
    }

    public int update(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

}