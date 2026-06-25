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
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> byUsername = userRepository.findByUsername(username);
		
		return null;
	}

}
