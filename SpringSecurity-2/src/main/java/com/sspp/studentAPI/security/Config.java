package com.sspp.studentAPI.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class Config {

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
