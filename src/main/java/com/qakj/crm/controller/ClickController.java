package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Click;
import com.qakj.crm.service.ClickService;

@RequestMapping("/clickController")
@RestController
public class ClickController {

	@Autowired
	private ClickService cs;
	
	@RequestMapping("/getClick")
	public Map<String,Object> getClick(){
		List<Click> list =cs.getAll();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("list", list);
		return map;
	}
	
	@RequestMapping("/delete/{id}")
	
	public String delete(@PathVariable("id") int id){
		cs.delete(id);
		return "删除成功";
	}
	
	
}
