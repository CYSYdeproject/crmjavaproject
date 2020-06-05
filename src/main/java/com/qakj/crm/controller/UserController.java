package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.User;
import com.qakj.crm.service.UserService;
@RestController
@RequestMapping("/userController")
public class UserController {
	@Autowired
	private UserService us;
	@RequestMapping("/login")
	public Map<String,Object> login(@RequestParam("username")String username,@RequestParam("password")String password,HttpSession session){
		Map<String,Object> map=new HashMap<String, Object>();
		User user=us.getUseruserNameAndPassword(username,password);
		if(user!=null){
			session.setAttribute("user",user);
			map.put("code", "520");
			map.put("msg", "登录成功");
			return map;
		}
		map.put("code", "400");
		map.put("msg", "登录失败");
		return map;
	}
	@RequestMapping("/user")
	public Map<String,Object> getUser(HttpSession session){
		Map<String,Object> map=new HashMap<String, Object>();
		Object user = session.getAttribute("user");
		if(user!=null){
			session.setAttribute("user",user);
			map.put("code", "520");
			map.put("user",user);
			return map;
		}
		map.put("code", "400");
		return map;
	}
	@RequestMapping("/logout")
	public Map<String,Object> logout(HttpSession session){
		session.invalidate();
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("code", 886);
		return map;
	}
	@RequestMapping("/update")
	public Map<String,Object> updatepassword(@RequestParam("id")Integer id,@RequestParam("password")String password){
		us.updatepasswordByid(id, password);
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("code","123");
		return map;
	}
}
