package com.service;

import com.dao.UserDao;
import com.user.User;

public class UserService {

	// bussiness logic
	
	UserDao dao = new UserDao();
	
	public String insertUser(User user)
	{
		
		 String msg = dao.insertUser(user);
		
		return msg;
	}
}
