package com.allcheer.refmobile.dal.mapper;

import com.allcheer.refmobile.dal.dao.MPMEMBDO;
import com.allcheer.refmobile.dal.dao.MPMEMBDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MPMEMBDOMapper {
    int countByExample(MPMEMBDOExample example);

    int deleteByExample(MPMEMBDOExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(MPMEMBDO record);

    int insertSelective(MPMEMBDO record);

    List<MPMEMBDO> selectByExample(MPMEMBDOExample example);

    MPMEMBDO selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") MPMEMBDO record, @Param("example") MPMEMBDOExample example);

    int updateByExample(@Param("record") MPMEMBDO record, @Param("example") MPMEMBDOExample example);

    int updateByPrimaryKeySelective(MPMEMBDO record);

    int updateByPrimaryKey(MPMEMBDO record);
}