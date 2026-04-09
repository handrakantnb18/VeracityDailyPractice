package com.service;

import java.util.List;

import com.dao.UserDao;
import com.entity.User;
import com.exception.UserNotFoundException;

public class UserService 
{

	UserDao dao = new UserDao();

	public String save(User user)
	{
		return dao.saveUser(user);
	}
	
	public User getUser(int id)
	{
		User user = dao.getUser(id);
		 if(user == null)
		 {
			 throw new UserNotFoundException("USer not found with id : "+id);
		 }
		 
		 return user;
		//return dao.getUser(id);
	}
	
	
	public List<User> getAll()
	{
		return dao.getAllUSers();
	}
	
}
