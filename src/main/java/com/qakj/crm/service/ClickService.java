package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.Click;

public interface ClickService {

	List<Click> getAll();
	void delete (int id);
}
