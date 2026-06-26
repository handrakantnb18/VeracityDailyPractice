package com.sspp.studentAPI.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sspp.studentAPI.entity.User;
import com.sspp.studentAPI.repo.UserRepository;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@Autowired
	BCryptPasswordEncoder encoder;
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/create")
	public void createUser(@RequestBody User user)
	{
		
	}
}
