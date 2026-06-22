package com.sspp.studentAPI.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sspp.studentAPI.entity.Product;
import com.sspp.studentAPI.service.ProductService;

@RestController
public class ProductRestController {

	// from browser we can send only GET method
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable Integer id)
	{
		Product product = productService.getProductById(id);
		
		return product;
	}
}
