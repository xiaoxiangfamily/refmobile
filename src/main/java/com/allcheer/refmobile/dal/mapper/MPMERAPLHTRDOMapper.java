package com.allcheer.refmobile.dal.mapper;

import com.allcheer.refmobile.dal.dao.MPMERAPLHTRDO;
import com.allcheer.refmobile.dal.dao.MPMERAPLHTRDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MPMERAPLHTRDOMapper {
    int countByExample(MPMERAPLHTRDOExample example);

    int deleteByExample(MPMERAPLHTRDOExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(MPMERAPLHTRDO record);

    int insertSelective(MPMERAPLHTRDO record);

    List<MPMERAPLHTRDO> selectByExample(MPMERAPLHTRDOExample example);

    MPMERAPLHTRDO selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") MPMERAPLHTRDO record, @Param("example") MPMERAPLHTRDOExample example);

    int updateByExample(@Param("record") MPMERAPLHTRDO record, @Param("example") MPMERAPLHTRDOExample example);

    int updateByPrimaryKeySelective(MPMERAPLHTRDO record);

    int updateByPrimaryKey(MPMERAPLHTRDO record);
}