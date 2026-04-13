package com.service;

import com.dao.UserDao;
import com.entity.User;

public class UserService {

	UserDao dao = new UserDao();
	
	public String saveUser(User user)
	{
		return dao.saveUser(user);
	}
}
