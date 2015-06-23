package com.bbh.shop.provider.repository;

import com.bbh.config.mybatis.MyBatisRepository;
import com.bbh.shop.api.entity.Role;
import tk.mybatis.mapper.common.Mapper;
@MyBatisRepository
public interface RoleMapper extends  Mapper<Role> {
}