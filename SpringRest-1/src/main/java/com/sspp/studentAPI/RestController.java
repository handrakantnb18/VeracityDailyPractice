package com.sspp.studentAPI;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	// Rest Controller class is used to create APIS,  return responce API Responce
	// Controller class is used to return frontend VIEW .. reyrn product-form
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome I am using REST APIS";
	}
	 
}
