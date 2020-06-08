package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.LinkmanMapper;
import com.qakj.crm.pojo.Linkman;
import com.qakj.crm.service.LinkmanService;
@Transactional
@Service
public class LinkmanServiceimpl implements LinkmanService{
	@Autowired
	private LinkmanMapper lm;
	@Override
	public List<Linkman> getlinkmans() {
		List<Linkman> linkmans = lm.getlinkmans();
		return linkmans;
	}

	@Override
	public int addLinkman(Linkman linkman) {
		int i = lm.insertSelective(linkman);
		return i;
	}

}
