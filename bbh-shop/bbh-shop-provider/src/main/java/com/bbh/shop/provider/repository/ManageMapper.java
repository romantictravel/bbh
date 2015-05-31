package com.bbh.shop.provider.repository;


import com.bbh.config.mybatis.MyBatisRepository;
import com.bbh.shop.api.entity.Manage;
import com.bbh.shop.provider.service.condition.ManageCondition;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@MyBatisRepository
public interface ManageMapper {
    int countByExample(ManageCondition example);

    int deleteByExample(ManageCondition example);

    int deleteByPrimaryKey(String id);

    int insert(Manage record);

    int insertSelective(Manage record);

    List<Manage> selectByExample(ManageCondition example);

    Manage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Manage record, @Param("example") ManageCondition example);

    int updateByExample(@Param("record") Manage record, @Param("example") ManageCondition example);

    int updateByPrimaryKeySelective(Manage record);

    int updateByPrimaryKey(Manage record);
}