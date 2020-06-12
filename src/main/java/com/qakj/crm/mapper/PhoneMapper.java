package com.qakj.crm.mapper;

import com.qakj.crm.pojo.Phone;
import com.qakj.crm.pojo.PhoneExample;


import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhoneMapper {
	List<Phone> selectByLimit(@Param("start") int start,@Param("len") int len,@Param("searchName") String searchName);
	
    int countByExample(PhoneExample example);

    int deleteByExample(PhoneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Phone record);

    int insertSelective(Phone record);

    List<Phone> selectByExample(PhoneExample example);

    Phone selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Phone record, @Param("example") PhoneExample example);

    int updateByExample(@Param("record") Phone record, @Param("example") PhoneExample example);

    int updateByPrimaryKeySelective(Phone record);

    int updateByPrimaryKey(Phone record);
}