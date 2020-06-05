package com.qakj.crm.service;

import com.qakj.crm.pojo.User;

public interface UserService {
	User getUseruserNameAndPassword(String username,String password);
	void updatepasswordByid(Integer id,String password);
}
