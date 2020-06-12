package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.qakj.crm.pojo.Scm;
import com.qakj.crm.service.ScmService;

@RequestMapping("/scmController")
@RestController
public class ScmController {

	@Autowired
	private ScmService ss;
	
	
	@RequestMapping("/getScm")
	public Map<String,Object> getScm(){
		List<Scm> list =ss. getAll();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("list", list);
		return map;
	
	
	
}
}