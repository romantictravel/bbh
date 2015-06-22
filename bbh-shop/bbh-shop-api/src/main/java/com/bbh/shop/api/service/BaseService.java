package com.bbh.shop.api.service;

import java.io.Serializable;

/**
 * Created by roman_000 on 2015/6/21.
 */
public interface BaseService<T> {

    public int save(T entity);

    public int delete(T entity);

    public int update(T entity) ;
}
