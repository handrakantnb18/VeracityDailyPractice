package com.services;

import java.util.ArrayList;

import com.dao.ProductDao;
import com.exception.ProductIsNullException;
import com.exception.ProductNotFoundException;
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
	
	public String delete(int id)
	{
		String msg = dao.delete(id);
		
		if(msg == null)
		{
			throw new SomethingWentWrongException("Check SQL Query");
			
		}
		return msg;
	}
		// get single product from table
		
		public Product getProductById(int id)
		{
			Product product = dao.getProductById(id);
			
			if(product == null)
			{
				throw new ProductIsNullException("Product Null");
			}
			return product;
		}
		
		// getAll Product into table
		
		public ArrayList<Product> getAll()
		{
			ArrayList<Product> products = dao.getAllProducts();
			
			if(products.isEmpty())
			{
				throw new ProductNotFoundException("No Product Found.");
			}
			
			return products;
		}
		
	
}
