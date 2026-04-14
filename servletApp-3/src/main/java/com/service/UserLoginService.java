package com.service;

import com.dao.UserLoginDao;
import com.entity.UserLogin;

public class UserLoginService {

	UserLoginDao daol =new UserLoginDao();
	
	public String saveUserLogin(UserLogin userLogin)
	{
		return daol.saveUserLogin(userLogin);
	}
}
