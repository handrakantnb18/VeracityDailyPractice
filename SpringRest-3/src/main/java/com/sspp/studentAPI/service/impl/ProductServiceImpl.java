package com.sspp.studentAPI.service.impl;

import java.util.Arrays;
import java.util.List;

import com.sspp.studentAPI.entity.Product;
import com.sspp.studentAPI.service.ProductService;

public class ProductServiceImpl implements ProductService {

	public List<Product> getAllProducts()
	{
		Product product1 = new Product(1,"Laptop",45000.00,1,"Elecronics");

		Product product2 = new Product(2,"Mobile",25000.00,2,"Elecronics");
		
		Product product3 = new Product(3,"Tshirt",4500.00,10,"Cloths");
		
		Product product4 = new Product(4,"Pen",450.00,125,"Stationary");
		
		Product product5 = new Product(5,"Suger",450.00,10,"Grosary");
		
		List<Product> products = Arrays.asList(product1,product2,product3,product4,product5);
		
		return products;
	}
	
	
	@Override
	public List<Product> getProductById(Integer id) {
		// TODO Auto-generated method stub
		List<Product> allProducts = getAllProducts();
		
		return allProducts;
	}

}
