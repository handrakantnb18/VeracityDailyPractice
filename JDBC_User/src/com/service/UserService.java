package com.service;

import java.util.ArrayList;

import com.dao.UserDao;
import com.exception.SomethingWentWrongException;
import com.exception.UserIsNullException;
import com.exception.UserNotFoundException;
import com.user.User;

public class UserService {

	// bussiness logic
	
	UserDao dao = new UserDao();
	
	// insert user check the null 
	public String insertUser(User user)
	{
		if(user == null)
		{
			throw new UserIsNullException("User is Null");
		}
		 String msg = dao.insertUser(user);
		
		return msg;
	}
	
	// update user data
	
	public String update(User user)
	{
		String msg= dao.updateUser(user);
		
		if(msg == null)
		{
			throw new SomethingWentWrongException("Check your SQL query.");
		}
		return msg;
	}
	
	
	// Delete user from table
	
	public String delete(int id)
	{
		String msg = dao.delete(id);
		
		if(msg == null)
		{
			throw new SomethingWentWrongException("Check your SQL Query.");
		}
		return msg;
	}
	
	// get single user from table by id
	
	
	public User getUserById(int id)
	{
		User user = dao.getUserById(id);
		
		if(user == null)
		{
			throw new UserIsNullException("User Null");
		}
		
		return user;
	}
	
	
	// get all users from table
	
	public ArrayList<User> getAll()
	{
		ArrayList<User> users = dao.getAllUsers();
		
		if(users.isEmpty())
		{
			
			throw new UserNotFoundException("No User found in the database");
		}
		
		return users;
	}
	
	
}
