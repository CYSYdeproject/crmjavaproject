package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.ClickMapper;
import com.qakj.crm.pojo.Click;
import com.qakj.crm.service.ClickService;


@Transactional
@Service
public class ClickServiceImpl  implements ClickService{

	@Autowired
	private ClickMapper cm;
	
	@Override
	public List<Click> getAll() {
		return  cm.selectByExample(null);
	}

	@Override
	public void delete(int id) {
		cm.deleteByPrimaryKey(id);
		
	}

}
