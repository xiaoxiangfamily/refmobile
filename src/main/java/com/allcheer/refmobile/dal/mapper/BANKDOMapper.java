package com.allcheer.refmobile.dal.mapper;

import com.allcheer.refmobile.dal.dao.BANKDO;
import com.allcheer.refmobile.dal.dao.BANKDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BANKDOMapper {
    int countByExample(BANKDOExample example);

    int deleteByExample(BANKDOExample example);

    int deleteByPrimaryKey(String bankId);

    int insert(BANKDO record);

    int insertSelective(BANKDO record);

    List<BANKDO> selectByExample(BANKDOExample example);

    BANKDO selectByPrimaryKey(String bankId);

    int updateByExampleSelective(@Param("record") BANKDO record, @Param("example") BANKDOExample example);

    int updateByExample(@Param("record") BANKDO record, @Param("example") BANKDOExample example);

    int updateByPrimaryKeySelective(BANKDO record);

    int updateByPrimaryKey(BANKDO record);
}