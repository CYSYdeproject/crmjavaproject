package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.Customer;
import com.qakj.crm.pojo.Maven;

public interface CustomerService {
	List<Customer> getAll();
	List<Customer> getCustomers(int currentPage,int pageSize,String searchName);
	int getCustomerName(String searchName);
	Customer getCustomerById(int id);
	List<Maven> getmaven();
}
