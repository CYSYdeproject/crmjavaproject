package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Retrieval;

import com.qakj.crm.service.RetrievalService;

@RequestMapping("/retrievalController")
@RestController
public class RetrievalController {

	@Autowired
	private RetrievalService rs;
	
	@RequestMapping("/getRetrieval")
	public Map<String,Object> getRetrieval(){
		List<Retrieval> list =rs. getAll();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("list", list);
		return map;
	
	
	
}
}
