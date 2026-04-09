package com.service;

import com.dao.UserDao;
import com.entity.User;

public class UserService 
{

	UserDao dao = new UserDao();

	public String save(User user)
	{
		return dao.saveUser(user);
	}
	
	public User getUser(int id)
	{
		return dao.getUser(id);
	}
	
	
}
