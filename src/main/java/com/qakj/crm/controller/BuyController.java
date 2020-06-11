package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Buy;
import com.qakj.crm.service.BuyService;

@RequestMapping("/buyController")
@RestController
public class BuyController {
	@Autowired
	private BuyService bs;
	@RequestMapping("/getbuybysearchname")
	public Object getbuybysearchname(@RequestParam("currentPage") Integer currentPage,@RequestParam("pageSize") Integer pageSize,@RequestParam("searchName") String searchName){
		if(searchName == null || "".equals(searchName)){
			searchName = "%%";
		}else{
			searchName = "%"+searchName+"%";
		};
		List<Buy> list = bs.getBuy(currentPage, pageSize, searchName);
		int count = bs.getcount(searchName);
		int countPage = count % pageSize == 0?count / pageSize: (count / pageSize) + 1;
		Map<String,Object> map = new HashMap<String,Object>();
		if(list!=null){
			map.put("countPage", countPage);
		map.put("list", list);
		map.put("code", "520");
		return map;
		}		
		map.put("code","400");
		return map;
	}
	@RequestMapping("/getallbuy")
	public Object getall(){
		List<Buy> list = bs.getall();
		Map<String,Object> map=new HashMap<String,Object>();
		if(list!=null){
			map.put("buys",list);
			map.put("code","520");
		}else{
			map.put("code","400");
		}
		return map;
	}
	@RequestMapping("/addbuy")
	public Object addbuy(Buy buy){
		Map<String,Object> map=new HashMap<String,Object>();
		int i = bs.addbuy(buy);
		if(i>0){
			map.put("code", "520");
			map.put("msg", "添加成功");
			return map;
		}
		map.put("code", "200");
		map.put("msg", "添加失败");
		return map;
	}
	@RequestMapping("/deleteone/{id}")
	public Object deletebuy(@PathVariable("id")int id){
		 bs.deletebuy(id);
		return"删除成功";
	}
	@RequestMapping("/selectbuy/{id}")
	public Object selectbuybyid(@PathVariable("id") int id){
		Buy buy = bs.getbuybyid(id);
			return buy;	
	}
	@RequestMapping("/update")
	public Object updatebuy(Buy buy){
		int i = bs.update(buy);
		Map<String,Object> map=new HashMap<String,Object>();
		if(i>0){
		map.put("code", "520");	
		map.put("msg", "修改成功");
		return map;
		}
		map.put("code", "400");	
		map.put("msg", "修改失败");
		return map;
	}
}
