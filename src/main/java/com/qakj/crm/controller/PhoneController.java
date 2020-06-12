package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Phone;
import com.qakj.crm.service.PhoneService;



@RequestMapping("/phoneController")
@RestController
public class PhoneController {
    @Autowired 
	private PhoneService phoneService;
    
    @RequestMapping("/findAll")
    public Map<String,Object> getphone(){
    	List<Phone> list = phoneService.getAll();
    	Map<String,Object> map=new HashMap<String, Object>();
    	map.put("list", list);
		return map;
    	
    }
    
    @RequestMapping("/add")
	public String add(Phone phone){
    	phoneService.addPhone(phone);
		return "添加成功";
	}
    
    @RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id){
    	phoneService.delete(id);
		return "删除成功";
	}
    
    @RequestMapping("/getPhone")
    public Map<String,Object> getPhone(@RequestParam("currentPage") Integer currentPage,@RequestParam("pageSize") Integer pageSize,@RequestParam("searchName") String searchName){
		//判断搜索的名字
		if(searchName == null || "".equals(searchName)){
			searchName = "%%";
		}else{
			searchName = "%"+searchName+"%";
		}
		//页面显示的数据
		List<Phone> list = phoneService.getPhone(currentPage, pageSize,searchName);
		//获取总记录数
		int count = phoneService.getCount(searchName);
		//总页数,可以进行计算
		int countPage = count % pageSize == 0?count / pageSize: (count / pageSize) + 1;
		//需要把总页数和页面显示的数据都响应json
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("countPage", countPage);
		map.put("list", list);
		return map;
	}
	
}
