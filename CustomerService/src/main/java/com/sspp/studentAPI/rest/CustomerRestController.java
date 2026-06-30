package com.sspp.studentAPI.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

	@GetMapping("/customer/{id}")
	public ResponseEntity<Map<String, Object>> GetCustomerById(@PathVariable Integer id)
	{
		Map<String, Object> customer = new HashMap<String, Object>();
		customer.put("Id :", id);
		customer.put("Name : ", "Shivraj");
		customer.put("Address : ", "Sangli");
		customer.put("MobileNo : ", 55985994995L);
		customer.put("Email : ", "shivraj@gmail.com");
		
		return new ResponseEntity<Map<String, Object>>(customer, HttpStatus.OK);
				
	}
}
