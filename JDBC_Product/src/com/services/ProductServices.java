package com.services;

import com.dao.ProductDao;
import com.product.Product;

public class ProductServices {

	ProductDao dao = new ProductDao();
	
	// insert product in table
	
	public String insertProduct(Product product)
	{
		 String msg = dao.insertProduct(product);
		
		return msg;
	}
}
