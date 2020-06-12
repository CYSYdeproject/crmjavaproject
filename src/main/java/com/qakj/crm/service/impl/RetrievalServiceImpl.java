package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.RetrievalMapper;
import com.qakj.crm.pojo.Retrieval;
import com.qakj.crm.service.RetrievalService;


@Transactional
@Service
public class RetrievalServiceImpl implements RetrievalService {

	@Autowired
	private RetrievalMapper rm;
	
	@Override
	public List<Retrieval> getAll() {
		
    return  rm.selectByExample(null);
	}

}
