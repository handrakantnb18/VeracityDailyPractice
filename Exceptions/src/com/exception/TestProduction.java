package com.exception;

public class TestProduction {

	
	void product(String productName) throws ProductNotFoundException
	{
		if(!productName.equals("Samsung"))
		{
		throw new ProductNotFoundException("Product not valid");
		}
		System.out.println("Product accessfully");
	}
	
	
	public static void main(String[] args) {
		TestProduction tp = new TestProduction();
		
		try {
			tp.product("Samsung");
		}
		catch(ProductNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
