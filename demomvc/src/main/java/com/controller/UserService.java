package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



public class UserService {

	@Autowired
	private UserDemo userDao;
	
	@javax.transaction.Transactional
	public void saveUsers(List<User> users)
	{
		userDao.saveUser(users);
	}
}
