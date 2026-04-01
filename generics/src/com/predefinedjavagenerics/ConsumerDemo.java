package com.predefinedjavagenerics;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		// java predefined generics
		
//		Consumer<Integer> c = (i)->
//		{
//			System.out.println(i);
//		};
//		
//		c.accept(500);
		
		Consumer<String> c1= (j)->
		{
			System.out.println(j);
		};
	
		c1.accept("Chandrakant");
		
		
		
	}
	
	
}
