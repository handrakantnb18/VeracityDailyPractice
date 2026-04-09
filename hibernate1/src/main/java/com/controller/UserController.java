package com.controller;

import java.util.List;

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
	
	public List<User> getAll()
	{
		return service.getAll();
	}
	
	public String update(User user)
	{
		return service.update(user);
	}
}
