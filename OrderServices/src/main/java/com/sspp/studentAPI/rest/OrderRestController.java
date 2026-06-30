package com.sspp.studentAPI.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderRestController {

//	@Autowired
//	RestTemplate restTemplate;
	
	@GetMapping("/order/{orderId}")
	public ResponseEntity<Map<String, Object>> getOrderById(@PathVariable Integer orderId)
	{
		Map<String, Object> order = new LinkedHashMap<String, Object>();
		
//		Map customer = restTemplate.getForObject("http://localhost:8080/customer/101", Map.class);
		
		order.put("Order id ", orderId);
		order.put("Name ", "Laptop");
		order.put("Price ", 550000.00);
		order.put("Qty ", 10);
		order.put("DiliveryAddress ", "abc building, bhekrai agar, hadapsar, pune - 411028");
//		order.put("Customer", customer);
		
		
		return new ResponseEntity<Map<String, Object>>(order,HttpStatus.OK);
		
	}
}
