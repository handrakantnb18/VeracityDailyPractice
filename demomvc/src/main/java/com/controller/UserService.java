package com.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;



public class UserService {

	@Autowired
	private UserDemo userDao;
	
	@Transactional
	public void saveUser(List<User> users)
	{
		userDao.saveUser(users);
	}
}
