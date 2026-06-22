package com.sspp.studentAPI.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sspp.studentAPI.entity.Product;
import com.sspp.studentAPI.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductRestController {

	// from browser we can send only GET method
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer id)
	{
		Product product = productService.getProductById(id);
		
		product = null;
		
		if(product == null)
		{
			return new ResponseEntity<Product>(product, HttpStatus.INTERNAL_SERVER_ERROR);

		}
		return new ResponseEntity<Product>(product, HttpStatus.OK);
		
		
//		return new ResponseEntity<Product>(product, HttpStatus.CREATED);
		

	}

//	@GetMapping("/product/{id}")
//	public Product getProductById(@PathVariable Integer id)
//	{
//		Product product = productService.getProductById(id);
//		
//		return product;
//	}
//	
//	@GetMapping("/products")
//	public List<Product> getAllProducts()
//	{
//		List<Product> allproducts =  productService.getAllproducts();
//		
//		return allproducts;
//	}
	
}
