package com.sspp.studentAPI.rest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {

	@GetMapping("/order/{orderId}")
	public ResponseEntity<Map<String, Object>> getOrderById(@PathVariable Integer orderId)
	{
		Map<String, Object> order = new LinkedHashMap<String, Object>();
		
		order.put("Order id ", orderId);
		order.put("Name ", "Laptop");
		order.put("Price ", 550000.00);
		order.put("Qty ", 10);
		order.put("DiliveryAddress ", "abc building, bhekrai agar, hadapsar, pune - 411028");
		
		return new ResponseEntity<Map<String, Object>>(order,HttpStatus.OK);
		
	}
}
