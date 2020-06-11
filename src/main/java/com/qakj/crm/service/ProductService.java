package com.qakj.crm.service;

import java.util.Date;
import java.util.List;

import com.qakj.crm.pojo.Product;

public interface ProductService {
	//添加
	void addprodect(Product product);
	//查询全部
	List<Product> getall();
	List<Product> getproducts(int currentPage,int pageSize,int selectprice1,int selectprice2);
	int getresult(int selectprice1,int selectprice2);
	
}
