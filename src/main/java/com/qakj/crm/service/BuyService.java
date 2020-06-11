package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.Buy;

public interface BuyService {
	 List<Buy> getall();
	 int addbuy(Buy buy);
	int deletebuy(int id);
	int update(Buy buy);
	Buy getbuybyid(int id);
	int getcount(String searchName);
	List<Buy> getBuy(int currentPage,int pageSize,String searchName);
}
