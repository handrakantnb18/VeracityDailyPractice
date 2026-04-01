package com.predefinedjavagenerics;

import java.util.function.Consumer;

public class ProductList {

	
	public static void main(String[] args) {
		
		Consumer<Product> c1 = (a)->
		{
			System.out.println(a);
		};
		
		c1.accept(new Product(1, "Samsung", 25000, "Pune"));
		
	}
}
