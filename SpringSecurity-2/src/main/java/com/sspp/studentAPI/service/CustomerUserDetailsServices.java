package com.sspp.studentAPI.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sspp.studentAPI.entity.User;
import com.sspp.studentAPI.repo.UserRepository;

public class CustomerUserDetailsServices implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	
	// Spring IOC will call internally
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> byUsername = userRepository.findByUsername(username);
		
		if(byUsername.isPresent())
		{
			User dbUser = byUsername.get();
			
			
			// give the user to the Spring security context/IOC for authentication  
			return org.springframework.security.core.userdetails.User
					.withUsername(dbUser.getUsername())
					.password(dbUser.getPassword())
					.roles(dbUser.getRole())
					.build();
		}
		
		
		throw new UsernameNotFoundException("User not found with username : "+username);
	}

}
