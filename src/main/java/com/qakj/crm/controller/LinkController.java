package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Linkman;
import com.qakj.crm.service.LinkmanService;
@RestController
@RequestMapping("/linkController")
public class LinkController {
	@Autowired
	private LinkmanService ls;
	@RequestMapping("/getlinkmans")
	public Object getlinkmans(){
		List<Linkman> linkmans = ls.getlinkmans();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("code","520");
		map.put("data", linkmans);
		return map;
	}
	@RequestMapping("/addlinkman")
	public Object addlinkman(Linkman linkman){
		int i = ls.addLinkman(linkman);
		Map<String,Object> map=new HashMap<String,Object>();
		if(i>0){
			map.put("code", "520");
			map.put("msg", "添加成功");
			return map;
		}
		map.put("code", "200");
		map.put("msg", "添加失败");
		return map;
	}
}
