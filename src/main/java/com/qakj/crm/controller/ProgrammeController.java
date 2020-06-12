package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Programme;
import com.qakj.crm.service.ProgrammeService;

@RequestMapping("/programmeController")
@RestController
public class ProgrammeController {
    @Autowired
	private ProgrammeService ps;
    
    @RequestMapping("/getprogramme")
	public Map<String,Object> getprogramme(){
    	List<Programme> list = ps.getAll();
    	 Map<String,Object> map=new HashMap<String,Object>();
    	 map.put("list", list);
		return map;
		
	}
		
	
}
