package com.allcheer.refmobile.dal.mapper;

import com.allcheer.refmobile.dal.dao.MPMERAPPLYDO;
import com.allcheer.refmobile.dal.dao.MPMERAPPLYDOExample;
import com.allcheer.refmobile.dal.dao.MPMERAPPLYDOKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MPMERAPPLYDOMapper {
    int countByExample(MPMERAPPLYDOExample example);

    int deleteByExample(MPMERAPPLYDOExample example);

    int deleteByPrimaryKey(MPMERAPPLYDOKey key);

    int insert(MPMERAPPLYDO record);

    int insertSelective(MPMERAPPLYDO record);

    List<MPMERAPPLYDO> selectByExample(MPMERAPPLYDOExample example);

    MPMERAPPLYDO selectByPrimaryKey(MPMERAPPLYDOKey key);

    int updateByExampleSelective(@Param("record") MPMERAPPLYDO record, @Param("example") MPMERAPPLYDOExample example);

    int updateByExample(@Param("record") MPMERAPPLYDO record, @Param("example") MPMERAPPLYDOExample example);

    int updateByPrimaryKeySelective(MPMERAPPLYDO record);

    int updateByPrimaryKey(MPMERAPPLYDO record);
}