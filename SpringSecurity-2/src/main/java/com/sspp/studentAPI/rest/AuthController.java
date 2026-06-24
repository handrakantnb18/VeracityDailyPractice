package com.sspp.studentAPI.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sspp.studentAPI.entity.User;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@PostMapping("/create-user")
	public void createUsers(User user)
	{
		
	}
}
