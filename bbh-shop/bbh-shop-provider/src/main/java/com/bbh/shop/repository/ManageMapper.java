package com.bbh.shop.repository;
import com.bbh.shop.entity.Manage;
import com.bbh.shop.service.ManageCondition;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
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