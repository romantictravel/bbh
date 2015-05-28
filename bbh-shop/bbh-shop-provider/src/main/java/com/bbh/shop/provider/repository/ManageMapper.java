package com.bbh.shop.provider.repository;

import com.bbh.shop.api.entity.Manage;
import com.bbh.shop.provider.service.condition.ManageCondition;
import com.bbh.config.mybatis.MyBatisRepository;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@MyBatisRepository
public interface ManageMapper {
    int countByExample(ManageCondition example);

    int deleteByExample(ManageCondition example);

    int deleteByPrimaryKey(Long id);

    int insert(Manage record);

    int insertSelective(Manage record);

    List<Manage> selectByExample(ManageCondition example);

    Manage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Manage record, @Param("example") ManageCondition example);

    int updateByExample(@Param("record") Manage record, @Param("example") ManageCondition example);

    int updateByPrimaryKeySelective(Manage record);

    int updateByPrimaryKey(Manage record);
}