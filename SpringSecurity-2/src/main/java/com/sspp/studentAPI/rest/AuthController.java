package com.sspp.studentAPI.rest;

import com.sspp.studentAPI.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sspp.studentAPI.entity.User;

@RestController
@RequestMapping("/auth")
public class AuthController {

	private final UserRepository userRepository;
	
	@Autowired
	UserRepository useRepository;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;


	AuthController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	@PostMapping("/create-user")
	public ResponseEntity<User> createUsers(@RequestBody User user)
	{
		// password should save in encoding format
		
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		
		if(user.getUsername().equals("admin"))
		{
			user.setRole("ADMIN");
		}
		else
		{
			user.setRole("USER");
		}
		
		
		User savedUser = userRepository.save(user);
		
		return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
		
		
	}
}
