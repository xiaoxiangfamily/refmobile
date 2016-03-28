package com.allcheer.refmobile.dal.mapper;

import com.allcheer.refmobile.dal.dao.MPMPARAMDO;
import com.allcheer.refmobile.dal.dao.MPMPARAMDOExample;
import com.allcheer.refmobile.dal.dao.MPMPARAMDOKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MPMPARAMDOMapper {
    int countByExample(MPMPARAMDOExample example);

    int deleteByExample(MPMPARAMDOExample example);

    int deleteByPrimaryKey(MPMPARAMDOKey key);

    int insert(MPMPARAMDO record);

    int insertSelective(MPMPARAMDO record);

    List<MPMPARAMDO> selectByExample(MPMPARAMDOExample example);

    MPMPARAMDO selectByPrimaryKey(MPMPARAMDOKey key);

    int updateByExampleSelective(@Param("record") MPMPARAMDO record, @Param("example") MPMPARAMDOExample example);

    int updateByExample(@Param("record") MPMPARAMDO record, @Param("example") MPMPARAMDOExample example);

    int updateByPrimaryKeySelective(MPMPARAMDO record);

    int updateByPrimaryKey(MPMPARAMDO record);
}