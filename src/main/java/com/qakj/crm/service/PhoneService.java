package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.Phone;


public interface PhoneService {
   List<Phone> getAll();
   
   void addPhone(Phone phone);
   
   void delete(int id);
   
   List<Phone> getPhone(int currentPage,int pageSize,String searchName);
   
   int getCount(String searchName);
}
