package com.qakj.crm.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.qakj.crm.pojo.Product;
import com.qakj.crm.service.ProductService;
import com.qakj.crm.untils.UUIDUntil;


@RequestMapping("/productController")
@RestController
public class ProductController {
	@Autowired
	private ProductService ps;
	@RequestMapping("/addproduct")
	public Object addproduct(@RequestParam ("productprice") Integer productprice, @RequestParam ("productdes") String productdes, @RequestParam ("productsize") String productsize, @RequestParam ("productimg") MultipartFile img) throws Exception{
		String filename=UUIDUntil.getUUID()+img.getOriginalFilename();
		img.transferTo(new File("d:/upload/"+filename));
		Product p=new Product();
		p.setProductprice(productprice);
		p.setProductdes(productdes);
		p.setProductsize(productsize);
		p.setProductimg("http://localhost:8082/mycrmproject/img/"+filename);
		ps.addprodect(p);
		return "success";
	}
	@RequestMapping("/getAll")
	public Object getAll(){
		List<Product> list = ps.getall();
		Map<String,Object>map=new HashMap<String,Object>();
		if(list!=null){
			map.put("products",list);
			map.put("code","520");
			return map;
		}
		map.put("code", "400");
		return map;
	}
	@RequestMapping("/getproducts")
	public Object getproducts(@RequestParam("currentPage") int currentPage,@RequestParam("pageSize") int pageSize,@RequestParam("selectprice1") int selectprice1,@RequestParam("selectprice2") int selectprice2){
		List<Product> list = ps.getproducts(currentPage, pageSize, selectprice1, selectprice2);
		if(selectprice1==0 &&selectprice2==0 ||selectprice1>selectprice2){
			selectprice1=0;
			selectprice2=10000;
		}
		int count = ps.getresult(selectprice1, selectprice2);
		int countPage=count%pageSize==0?count/pageSize:(count/pageSize)+1;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", "520");
		map.put("data", list);
		map.put("countPage",countPage);
		return map;
	}
}
