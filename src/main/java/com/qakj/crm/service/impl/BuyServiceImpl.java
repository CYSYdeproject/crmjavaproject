package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.BuyMapper;
import com.qakj.crm.pojo.Buy;
import com.qakj.crm.pojo.BuyExample;
import com.qakj.crm.pojo.BuyExample.Criteria;
import com.qakj.crm.service.BuyService;

@Transactional
@Service
public class BuyServiceImpl implements BuyService{
	@Autowired
	private BuyMapper bm;
	@Override
	public List<Buy> getall() {
		return bm.selectByExample(null);
	}
	@Override
	public int addbuy(Buy buy) {
		 int i=bm.insertSelective(buy);
		return i;
	}
	@Override
	public int deletebuy(int id) {
		int i = bm.deleteByPrimaryKey(id);
		return i;
	}
	@Override
	public int update(Buy buy) {
		int i = bm.updateByPrimaryKeySelective(buy);
		return i;
	}
	@Override
	public Buy getbuybyid(int id) {
		Buy buy = bm.selectByPrimaryKey(id);
		return buy;
	}
	@Override
	public List<Buy> getBuy(int currentPage, int pageSize, String searchName) {
	return	bm.slecetbuybysearchname((currentPage-1) * pageSize, pageSize, searchName);
	
	}
	@Override
	public int getcount(String searchName) {
		BuyExample example=new BuyExample();
		Criteria criteria = example.createCriteria();
		criteria.andBuyerLike(searchName);
		int i = bm.countByExample(example);
		return i;
	}
	
}
