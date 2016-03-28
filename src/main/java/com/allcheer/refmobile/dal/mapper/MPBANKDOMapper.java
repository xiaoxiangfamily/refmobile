package com.allcheer.refmobile.dal.mapper;

import com.allcheer.refmobile.dal.dao.MPBANKDO;
import com.allcheer.refmobile.dal.dao.MPBANKDOExample;
import com.allcheer.refmobile.dal.dao.MPBANKDOKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MPBANKDOMapper {
    int countByExample(MPBANKDOExample example);

    int deleteByExample(MPBANKDOExample example);

    int deleteByPrimaryKey(MPBANKDOKey key);

    int insert(MPBANKDO record);

    int insertSelective(MPBANKDO record);

    List<MPBANKDO> selectByExample(MPBANKDOExample example);

    MPBANKDO selectByPrimaryKey(MPBANKDOKey key);

    int updateByExampleSelective(@Param("record") MPBANKDO record, @Param("example") MPBANKDOExample example);

    int updateByExample(@Param("record") MPBANKDO record, @Param("example") MPBANKDOExample example);

    int updateByPrimaryKeySelective(MPBANKDO record);

    int updateByPrimaryKey(MPBANKDO record);
}