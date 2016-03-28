package com.allcheer.refmobile.dal.mapper;

import com.allcheer.refmobile.dal.dao.MPMERDTLDO;
import com.allcheer.refmobile.dal.dao.MPMERDTLDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MPMERDTLDOMapper {
    int countByExample(MPMERDTLDOExample example);

    int deleteByExample(MPMERDTLDOExample example);

    int deleteByPrimaryKey(String memberId);

    int insert(MPMERDTLDO record);

    int insertSelective(MPMERDTLDO record);

    List<MPMERDTLDO> selectByExample(MPMERDTLDOExample example);

    MPMERDTLDO selectByPrimaryKey(String memberId);

    int updateByExampleSelective(@Param("record") MPMERDTLDO record, @Param("example") MPMERDTLDOExample example);

    int updateByExample(@Param("record") MPMERDTLDO record, @Param("example") MPMERDTLDOExample example);

    int updateByPrimaryKeySelective(MPMERDTLDO record);

    int updateByPrimaryKey(MPMERDTLDO record);
}