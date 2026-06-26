package com.sspp.studentAPI.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.sspp.studentAPI.entity.User;
import com.sspp.studentAPI.repo.UserRepository;

public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<User> byUserName = userRepository.findByUsername(username);

		if (byUserName.isPresent()) {
			User user = byUserName.get();

			return org.springframework.security.core.userdetails.User
					.withUsername(user.getUsername())
					.password(user.getPassword())
					.roles(user.getRole())
					.build();

		}
		
		throw new UsernameNotFoundException("User not found");

	}
}
