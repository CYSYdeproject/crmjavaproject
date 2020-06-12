package com.qakj.crm.mapper;

import com.qakj.crm.pojo.Programme;
import com.qakj.crm.pojo.ProgrammeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProgrammeMapper {
    int countByExample(ProgrammeExample example);

    int deleteByExample(ProgrammeExample example);

    int insert(Programme record);

    int insertSelective(Programme record);

    List<Programme> selectByExample(ProgrammeExample example);

    int updateByExampleSelective(@Param("record") Programme record, @Param("example") ProgrammeExample example);

    int updateByExample(@Param("record") Programme record, @Param("example") ProgrammeExample example);
}