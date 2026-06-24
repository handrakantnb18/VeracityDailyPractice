package com.sspp.studentAPI.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sspp.studentAPI.entity.User;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	
	@PostMapping("/create-user")
	public void createUsers(User user)
	{
		// password should save in encoding format
		
		
	}
}
