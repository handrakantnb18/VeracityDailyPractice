package com.generics.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ProductListConsumer {

	public static void main(String[] args) {
		
//		Consumer<ProductConsumer> c1 =(i)->
//		{
//			System.out.println(i);
//		};
//			
//			c1.accept(new ProductConsumer(1, "Samsung", 25000, "Pune"));
			
		
		Consumer<List<ProductConsumer>> c2 = (j)->
		{
			for(ProductConsumer pc :j)
			{
				System.out.println(pc);
			}
		};
		
		c2.accept(Arrays.asList(
				new ProductConsumer(1, "MI", 22000, "Mumbai"),
				new ProductConsumer(2, "OPPO", 45000, "Pune"),
				new ProductConsumer(3, "LG", 30000, "Delhi")));
		
		
	}
}
