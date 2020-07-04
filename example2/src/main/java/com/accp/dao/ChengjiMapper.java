package com.accp.dao;

import com.accp.domain.Chengji;
import com.accp.domain.ChengjiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChengjiMapper {
    int countByExample(ChengjiExample example);

    int deleteByExample(ChengjiExample example);

    int insert(Chengji record);

    int insertSelective(Chengji record);

    List<Chengji> selectByExample(ChengjiExample example);

    int updateByExampleSelective(@Param("record") Chengji record, @Param("example") ChengjiExample example);

    int updateByExample(@Param("record") Chengji record, @Param("example") ChengjiExample example);
}