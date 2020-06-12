package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.ProgrammeMapper;
import com.qakj.crm.pojo.Programme;
import com.qakj.crm.pojo.ProgrammeExample;
import com.qakj.crm.pojo.ProgrammeExample.Criteria;
import com.qakj.crm.service.ProgrammeService;

@Transactional
@Service
public class ProgrammeServiceImpl implements ProgrammeService{
	@Autowired
	private ProgrammeMapper pm;
	
	@Override
	public List<Programme> getAll() {
		 
		return pm.selectByExample(null);
	}

}
