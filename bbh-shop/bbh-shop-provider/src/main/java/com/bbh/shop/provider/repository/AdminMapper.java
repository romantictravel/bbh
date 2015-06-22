package com.bbh.shop.provider.repository;

import com.bbh.config.mybatis.MyBatisRepository;
import com.bbh.shop.api.entity.Admin;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@MyBatisRepository
public interface AdminMapper extends  Mapper<Admin> {
}