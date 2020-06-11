package com.qakj.crm.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.ProductMapper;
import com.qakj.crm.pojo.Product;
import com.qakj.crm.pojo.ProductExample;
import com.qakj.crm.pojo.ProductExample.Criteria;
import com.qakj.crm.service.ProductService;

@Service
@Transactional
public class ProducServiceImpl implements ProductService{
	@Autowired
	private ProductMapper pm;
	@Override
	public void addprodect(Product product) {
	pm.insertSelective(product);	
	}

	@Override
	public List<Product> getall() {
		ProductExample example=new ProductExample();
		List<Product> list = pm.selectByExample(example);
		return list;
	}

	@Override
	public List<Product> getproducts(int currentPage, int pageSize, int selectprice1, int selectprice2) {
	return 	pm.selectproductbyprice((currentPage-1)*pageSize,pageSize, selectprice1, selectprice2);	
	}

	@Override
	public int getresult(int selectprice1, int selectprice2) {
		ProductExample example=new ProductExample();
		Criteria criteria = example.createCriteria();
		criteria.andProductpriceGreaterThan(selectprice1);
		criteria.andProductpriceLessThan(selectprice2);
		int count = pm.countByExample(example);	
		return count;
	}

	


}
