package com.sspp.studentAPI.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.sspp.studentAPI.service.CustomerUserDetailsServices;

@Configuration
@EnableWebSecurity
public class Config {

	
	@Autowired
	CustomerUserDetailsServices customerUserDetailsServices;
	
	@Bean
	public DaoAuthenticationProvider authenticateUser()
	{
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider(customerUserDetailsServices);
		
		provider.setPasswordEncoder(encoder());
		
		return provider;
	}
	
	
	@Bean
	public BCryptPasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http)
	{
		// POST, PUT = we have to desable CSRF
		// but company can not be desable use to postman
		
		http.csrf(csrf -> csrf.disable()); // dessable to access the postman
		
		http.httpBasic(Customizer.withDefaults()); // to send basic auth from postman
		
		http.authorizeHttpRequests(auth ->{
			
			auth.requestMatchers("/auth/create-user").permitAll();
		});
		return http.build();
		
	}
}
