package com.sspp.studentAPI.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sspp.studentAPI.dto.ProductDto;
import com.sspp.studentAPI.entity.Product;
import com.sspp.studentAPI.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class ProductRestController {

	// from browser we can send only GET method
	
	@Autowired
	ProductService productService;
	
	// http://localhost:8080/api/v1/product/1
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer id)
	{
		Product product = productService.getProductById(id);
		
				
		if(product == null)
		{
			return new ResponseEntity<Product>(product, HttpStatus.INTERNAL_SERVER_ERROR);

		}
		return new ResponseEntity<Product>(product, HttpStatus.OK);
		
		
//		return new ResponseEntity<Product>(product, HttpStatus.CREATED);
		

	}

	// http://localhost:8080/api/v1/save
	@PostMapping("/save")
	public ResponseEntity<String> save(@Valid @RequestBody ProductDto productDto)
	{
		String msg = productService.saveProduct(productDto);
		System.out.println(productDto);
		
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		
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
	
	// http://localhost:8080/api/v1/products
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts()
	{
		List<Product> allproducts =  productService.getAllproducts();
		
		return new ResponseEntity<List<Product>>(allproducts, HttpStatus.OK);
		
	}

	// http://localhost:8080/api/v1/byname?name=iphone
	@GetMapping("/byname")
	public ResponseEntity<Product> getProductByName(@RequestParam String name)
	{
		Product product = productService.getProductByName(name);
		
		return new ResponseEntity<Product>(product, HttpStatus.OK);
		
	}
	
	
}
