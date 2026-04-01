package com.predefinedjavagenerics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ProductList {

	
	public static void main(String[] args) {
		
		
		 // single product access
		
//		Consumer<Product> c1 = (a)->
//		{
//			System.out.println(a);
//		};
//		
//		c1.accept(new Product(1, "Samsung", 25000, "Pune"));
//		
		
		// multiple product accept
		
		Consumer<List<Product>> c1 = (a)->
		{
			for(Product p : a)
			{
				System.out.println(p);
			}
		};
		c1.accept(Arrays.asList
				(new Product(1, "OPPO", 56000, "Mumbai"),
				new Product(2, "Samsung", 25000, "Pune"),
				new Product(3, "MI", 8800, "Delhi")));
	
		
		
	}
}
