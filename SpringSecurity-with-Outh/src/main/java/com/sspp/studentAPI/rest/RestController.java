package com.sspp.studentAPI.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to chandrakant bhosale";
	}
}



//spring.datasource.url=jdbc:mysql://localhost:3306/25june
//
//spring.datasource.username=root
//
//spring.datasource.password=root
//
//spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
//
//spring.jpa.hibernate.ddl-auto=update
//
//spring.jpa.show-sql=true
