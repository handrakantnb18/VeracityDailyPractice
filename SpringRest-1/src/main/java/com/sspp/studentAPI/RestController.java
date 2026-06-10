package com.sspp.studentAPI;

import java.util.HashMap;
import java.util.Map;

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
	
	@GetMapping("/user")
	public Map<String, String> getUser()
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("Vijay", "Student");
		map.put("Chandrakant", "Developer");
		map.put("Subhash", "Engineer");
		
		return map;
		
	}
}
