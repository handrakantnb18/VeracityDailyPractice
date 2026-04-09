package com.controller;

import com.entity.User;
import com.service.UserService;

public class UserController {

	
	UserService service = new UserService();
	
	public String save(User user)
	{
		return service.save(user);
	}
	
	public User getUser(int id)
	{
		return service.getUser(id);
	}
	
	
}
