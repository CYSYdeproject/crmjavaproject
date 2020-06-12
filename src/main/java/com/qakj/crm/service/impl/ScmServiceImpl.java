package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.ScmMapper;
import com.qakj.crm.pojo.Scm;


import com.qakj.crm.service.ScmService;



@Transactional
@Service
public class ScmServiceImpl implements ScmService {

	@Autowired
	private ScmMapper sm;
	
	@Override
	public List<Scm> getAll() {
     
		
		return sm.selectByExample(null);
	}

	}


