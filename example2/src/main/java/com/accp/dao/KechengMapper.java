package com.accp.dao;

import com.accp.domain.Kecheng;
import com.accp.domain.KechengExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KechengMapper {
    int countByExample(KechengExample example);

    int deleteByExample(KechengExample example);

    int insert(Kecheng record);

    int insertSelective(Kecheng record);

    List<Kecheng> selectByExample(KechengExample example);

    int updateByExampleSelective(@Param("record") Kecheng record, @Param("example") KechengExample example);

    int updateByExample(@Param("record") Kecheng record, @Param("example") KechengExample example);
}