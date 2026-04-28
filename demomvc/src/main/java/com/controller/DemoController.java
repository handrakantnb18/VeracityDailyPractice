package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DemoController {

	@Autowired
	private UserDemo userDemo;
	
	@RequestMapping("/first")
	public String firstDemoFunction()
	{
		return "firstmvcresponce";
	}
	
	@RequestMapping("/second")
	public String saveUser()
	{
		userDemo.saveUser();
		return"showuser";
		
	}
	
	public String userInsert()
	{
		
		List<User> list = new ArrayList();
		
		for(int i=1; i<=15;i++)
		{
			User user = new User();
			user.setName("User"+i);
			user.setEmail("User"+i+"@gmail.com");
			list.add(user);
			
		}
		
		userService.saveUser(list);
		
		return "userInertBulk";
	}
	
}
