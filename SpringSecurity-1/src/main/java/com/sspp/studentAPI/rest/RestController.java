package com.sspp.studentAPI.rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/welcome")
	public String welcome()
	{
		return "welcome we are learning Spring Security";
	}
}
