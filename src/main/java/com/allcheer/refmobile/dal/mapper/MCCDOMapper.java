package com.allcheer.refmobile.dal.mapper;

import com.allcheer.refmobile.dal.dao.MCCDO;
import com.allcheer.refmobile.dal.dao.MCCDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MCCDOMapper {
    int countByExample(MCCDOExample example);

    int deleteByExample(MCCDOExample example);

    int deleteByPrimaryKey(String mcc);

    int insert(MCCDO record);

    int insertSelective(MCCDO record);

    List<MCCDO> selectByExample(MCCDOExample example);

    MCCDO selectByPrimaryKey(String mcc);

    int updateByExampleSelective(@Param("record") MCCDO record, @Param("example") MCCDOExample example);

    int updateByExample(@Param("record") MCCDO record, @Param("example") MCCDOExample example);

    int updateByPrimaryKeySelective(MCCDO record);

    int updateByPrimaryKey(MCCDO record);
}