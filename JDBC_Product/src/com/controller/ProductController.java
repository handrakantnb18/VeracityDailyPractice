package com.controller;

import com.product.Product;
import com.services.ProductServices;

public class ProductController {

	ProductServices service = new ProductServices();
	
	// insert product into table
	
	public String insertProduct(Product product)
	{
		String msg= service.insertProduct(product);
		
		return msg;
	}
	
	
	
	// update product into table
	
	public String update(Product product)
	{
		return service.update(product);
	}
	
	// Delete one Product into table
	
	
}
