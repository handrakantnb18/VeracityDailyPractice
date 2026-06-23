package com.sspp.studentAPI.security;

import java.text.Normalizer.Form;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	// users creation
	
	// encription 
	// decreption password
	
	// encoder
	
	@Bean
	public BCryptPasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService createUsers()
	{
		UserDetails user1 = 
				User.
				withUsername("chandr")
				.password(encoder().encode("1818"))
				.roles("USER")
				.build();
		 
		UserDetails user2 = 
				 User.
				 withUsername("shiv")
				 .password(encoder().encode("5757"))
				 .roles("ADMIN")
				 .build();
				 
		return new InMemoryUserDetailsManager(user1,user2);
		 
	}
	
	@Bean
	public SecurityFilterChain securityLogic(HttpSecurity http)
	{
		
		http.authorizeHttpRequests(auth -> {
			
			auth.requestMatchers("/welcome").hasRole("USER")
			.requestMatchers("/admin").hasRole("ADMIN")
			.anyRequest().authenticated();
		}).formLogin(form -> form.permitAll()); // access for everyone
				
		
		return http.build();
	}
	
}
