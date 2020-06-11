package com.qakj.crm.mapper;

import com.qakj.crm.pojo.Maven;
import com.qakj.crm.pojo.MavenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MavenMapper {
	
    int countByExample(MavenExample example);

    int deleteByExample(MavenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Maven record);

    int insertSelective(Maven record);

    List<Maven> selectByExample(MavenExample example);

    Maven selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Maven record, @Param("example") MavenExample example);

    int updateByExample(@Param("record") Maven record, @Param("example") MavenExample example);

    int updateByPrimaryKeySelective(Maven record);

    int updateByPrimaryKey(Maven record);
}