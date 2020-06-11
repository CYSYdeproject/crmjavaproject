package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Maven;
import com.qakj.crm.service.MavenService;
@RestController
@RequestMapping("/mavenController")
public class MavenController {
	@Autowired
	private MavenService ms;
	
}
