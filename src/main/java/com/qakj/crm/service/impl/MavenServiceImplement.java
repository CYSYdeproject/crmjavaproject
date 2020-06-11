package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.MavenMapper;
import com.qakj.crm.pojo.Maven;
import com.qakj.crm.service.MavenService;
@Transactional
@Service
public class MavenServiceImplement implements MavenService{
@Autowired
private MavenMapper mm;
	

}
