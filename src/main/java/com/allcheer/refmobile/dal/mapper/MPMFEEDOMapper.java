package com.allcheer.refmobile.dal.mapper;

import com.allcheer.refmobile.dal.dao.MPMFEEDO;
import com.allcheer.refmobile.dal.dao.MPMFEEDOExample;
import com.allcheer.refmobile.dal.dao.MPMFEEDOKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MPMFEEDOMapper {
    int countByExample(MPMFEEDOExample example);

    int deleteByExample(MPMFEEDOExample example);

    int deleteByPrimaryKey(MPMFEEDOKey key);

    int insert(MPMFEEDO record);

    int insertSelective(MPMFEEDO record);

    List<MPMFEEDO> selectByExample(MPMFEEDOExample example);

    MPMFEEDO selectByPrimaryKey(MPMFEEDOKey key);

    int updateByExampleSelective(@Param("record") MPMFEEDO record, @Param("example") MPMFEEDOExample example);

    int updateByExample(@Param("record") MPMFEEDO record, @Param("example") MPMFEEDOExample example);

    int updateByPrimaryKeySelective(MPMFEEDO record);

    int updateByPrimaryKey(MPMFEEDO record);
}