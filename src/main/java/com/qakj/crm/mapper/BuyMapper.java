package com.qakj.crm.mapper;

import com.qakj.crm.pojo.Buy;
import com.qakj.crm.pojo.BuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyMapper {
	List<Buy> slecetbuybysearchname(@Param("start") int start,@Param("len") int len,@Param("searchName") String searchName);
	
    int countByExample(BuyExample example);

    int deleteByExample(BuyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Buy record);

    int insertSelective(Buy record);

    List<Buy> selectByExample(BuyExample example);

    Buy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Buy record, @Param("example") BuyExample example);

    int updateByExample(@Param("record") Buy record, @Param("example") BuyExample example);

    int updateByPrimaryKeySelective(Buy record);

    int updateByPrimaryKey(Buy record);
}