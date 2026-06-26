package com.sspp.studentAPI.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeRestController {

	@GetMapping
	public String welcomeMsg()
	{
		String msg = "welcome we are Learning Spring JWT SECURITY";
	
		return msg;
	}
}
