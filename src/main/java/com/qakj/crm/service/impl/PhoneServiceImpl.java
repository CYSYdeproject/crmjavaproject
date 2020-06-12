package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.PhoneMapper;
import com.qakj.crm.pojo.Phone;
import com.qakj.crm.pojo.PhoneExample;
import com.qakj.crm.pojo.PhoneExample.Criteria;
import com.qakj.crm.service.PhoneService;



@Transactional
@Service
public class PhoneServiceImpl implements PhoneService{
    @Autowired
	private PhoneMapper phoneMapper;
    
	@Override
	public List<Phone> getAll() {
		
		return phoneMapper.selectByExample(null);
	}

	@Override
	public void addPhone(Phone phone) {
		phoneMapper.insertSelective(phone);
		
	}

	@Override
	public void delete(int id) {
		phoneMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<Phone> getPhone(int currentPage, int pageSize, String searchName) {
		
		return phoneMapper.selectByLimit((currentPage-1) * pageSize, pageSize,searchName);
	}

	@Override
	public int getCount(String searchName) {
		PhoneExample example = new PhoneExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameLike(searchName);
		int count = phoneMapper.countByExample(example);
		return count;
	}

}
