package com.controller;

import java.util.ArrayList;

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
	
	public String delete(int id)
	{
		return service.delete(id);
	}
	
	// get single product into table
	
	public Product get(int id)
	{
		return service.getProductById(id);
	}
	
	
	// getAll Product from table
	
	public ArrayList<Product> getAll()
	{
		return service.getAll();
	}
}
