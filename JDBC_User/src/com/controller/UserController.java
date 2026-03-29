package com.controller;

import com.service.UserService;
import com.user.User;

public class UserController {

	UserService service = new UserService();
	
	// insertUser data
	
	public String insertUser(User user)
	{
		String msg =  service.insertUser(user);
		
		return msg;
	}
	
	
	// updateUser data
	
	public String update(User user)
	{
		String msg = service.update(user);
		
		return msg;
	}
	
	// delete one user 
	
	public String delete(int id)
	{
		return service.delete(id);
	}
	
	
	
	// get single user from table
	
	
	
}
