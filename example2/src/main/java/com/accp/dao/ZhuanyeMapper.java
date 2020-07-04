package com.accp.dao;

import com.accp.domain.Zhuanye;
import com.accp.domain.ZhuanyeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhuanyeMapper {
    int countByExample(ZhuanyeExample example);

    int deleteByExample(ZhuanyeExample example);

    int insert(Zhuanye record);

    int insertSelective(Zhuanye record);

    List<Zhuanye> selectByExample(ZhuanyeExample example);

    int updateByExampleSelective(@Param("record") Zhuanye record, @Param("example") ZhuanyeExample example);

    int updateByExample(@Param("record") Zhuanye record, @Param("example") ZhuanyeExample example);
}