package com.sspp.studentAPI.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {

	// users creation
	
	@Bean
	public UserDetailsService createUsers()
	{
		UserDetails user1 = 
				User.
				withUsername("chandr")
				.password("1818")
				.roles("USER")
				.build();
		 
		UserDetails user2 = 
				 User.
				 withUsername("Shiv")
				 .password("5757")
				 .roles("ADMIN")
				 .build();
				 
		return new InMemoryUserDetailsManager(user1,user2);
		 
	}
	
	
}
