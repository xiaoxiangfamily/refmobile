package com.allcheer.refmobile.dal.mapper;

import com.allcheer.refmobile.dal.dao.MPUSRDO;
import com.allcheer.refmobile.dal.dao.MPUSRDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MPUSRDOMapper {
    int countByExample(MPUSRDOExample example);

    int deleteByExample(MPUSRDOExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(MPUSRDO record);

    int insertSelective(MPUSRDO record);

    List<MPUSRDO> selectByExample(MPUSRDOExample example);

    MPUSRDO selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") MPUSRDO record, @Param("example") MPUSRDOExample example);

    int updateByExample(@Param("record") MPUSRDO record, @Param("example") MPUSRDOExample example);

    int updateByPrimaryKeySelective(MPUSRDO record);

    int updateByPrimaryKey(MPUSRDO record);
}