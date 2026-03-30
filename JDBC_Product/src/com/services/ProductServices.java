package com.services;

import com.dao.ProductDao;
import com.exception.SomethingWentWrongException;
import com.product.Product;

public class ProductServices {

	ProductDao dao = new ProductDao();
	
	// insert product in table
	
	public String insertProduct(Product product)
	{
		 String msg = dao.insertProduct(product);
		
		return msg;
	}
	
	// update product info
	
	public String update(Product product)
	{
		String msg = dao.updateProduct(product);
		
		if(msg == null)
		{
			throw new SomethingWentWrongException("Check SQL Query ");
			
		}
		return msg;
	}
	
	// Delete single product into table
	
	
}
