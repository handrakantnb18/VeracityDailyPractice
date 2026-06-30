package com.sspp.studentAPI.rest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sspp.studentAPI.Customer;
import com.sspp.studentAPI.OrderClient;

@RestController
public class CustomerRestController {

	@Autowired
	OrderClient orderClient;
	
	// Map
	// HashMap -- no insertion order
	// LinkedHashMap -- data send to insertion order
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<Map<String, Object>> GetCustomerById(@PathVariable Integer id)
	{
//		Map<String, Object> customer = new HashMap<String, Object>(); // no insertion order output
		Map<String, Object> customer = new LinkedHashMap<String, Object>(); // insertion order output
		
		Map<String, Object> order = orderClient.getOrder(id);
		customer.put("Id ", id);
		customer.put("Name ", "Shivraj");
		customer.put("Address ", "Sangli");
		customer.put("MobileNo ", 55985994995L);
		customer.put("Email ", "shivraj@gmail.com");
		customer.put("Order", order);
		
		return new ResponseEntity<Map<String, Object>>(customer, HttpStatus.OK);
				
	}
	
	
//	@GetMapping("/customer/{id}")
//	public ResponseEntity<Customer> GetCustomerById(@PathVariable Integer id)
//	{
//		Customer customer = new Customer(101, "Shivraj", "shiv@gmail.com", "484999659898", "Californiya");
//		
//		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
//				
//	}

}
