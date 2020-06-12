package com.qakj.crm.mapper;

import com.qakj.crm.pojo.Retrieval;
import com.qakj.crm.pojo.RetrievalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RetrievalMapper {
    int countByExample(RetrievalExample example);

    int deleteByExample(RetrievalExample example);

    int insert(Retrieval record);

    int insertSelective(Retrieval record);

    List<Retrieval> selectByExample(RetrievalExample example);

    int updateByExampleSelective(@Param("record") Retrieval record, @Param("example") RetrievalExample example);

    int updateByExample(@Param("record") Retrieval record, @Param("example") RetrievalExample example);
}