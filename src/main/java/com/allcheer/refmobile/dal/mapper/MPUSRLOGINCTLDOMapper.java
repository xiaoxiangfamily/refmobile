package com.allcheer.refmobile.dal.mapper;

import com.allcheer.refmobile.dal.dao.MPUSRLOGINCTLDO;
import com.allcheer.refmobile.dal.dao.MPUSRLOGINCTLDOExample;
import com.allcheer.refmobile.dal.dao.MPUSRLOGINCTLDOKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MPUSRLOGINCTLDOMapper {
    int countByExample(MPUSRLOGINCTLDOExample example);

    int deleteByExample(MPUSRLOGINCTLDOExample example);

    int deleteByPrimaryKey(MPUSRLOGINCTLDOKey key);

    int insert(MPUSRLOGINCTLDO record);

    int insertSelective(MPUSRLOGINCTLDO record);

    List<MPUSRLOGINCTLDO> selectByExample(MPUSRLOGINCTLDOExample example);

    MPUSRLOGINCTLDO selectByPrimaryKey(MPUSRLOGINCTLDOKey key);

    int updateByExampleSelective(@Param("record") MPUSRLOGINCTLDO record, @Param("example") MPUSRLOGINCTLDOExample example);

    int updateByExample(@Param("record") MPUSRLOGINCTLDO record, @Param("example") MPUSRLOGINCTLDOExample example);

    int updateByPrimaryKeySelective(MPUSRLOGINCTLDO record);

    int updateByPrimaryKey(MPUSRLOGINCTLDO record);
}