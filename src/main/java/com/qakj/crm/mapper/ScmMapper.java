package com.qakj.crm.mapper;

import com.qakj.crm.pojo.Scm;
import com.qakj.crm.pojo.ScmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScmMapper {
    int countByExample(ScmExample example);

    int deleteByExample(ScmExample example);

    int insert(Scm record);

    int insertSelective(Scm record);

    List<Scm> selectByExample(ScmExample example);

    int updateByExampleSelective(@Param("record") Scm record, @Param("example") ScmExample example);

    int updateByExample(@Param("record") Scm record, @Param("example") ScmExample example);
}