package com.controller;

import com.service.UserService;
import com.user.User;

public class UserController {

	UserService service = new UserService();
	
	public String insertUser(User user)
	{
		String msg =  service.insertUser(user);
		
		return msg;
	}
}
