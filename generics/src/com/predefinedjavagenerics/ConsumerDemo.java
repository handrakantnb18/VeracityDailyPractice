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
		
//		Consumer<String> c1= (j)->
//		{
//			System.out.println(j);
//			System.out.println("Hi, :"+j.toUpperCase());
//		};
//	
//		c1.accept("Chandrakant");
//		c1.accept("Priyanka");
		
		
//		Consumer<String[]> c2= (j)->
//		{
//			for(String s:j)
//			{
//			//System.out.println(j);
//			System.out.println(s.toUpperCase());
//			}
//		};
//		
//		c2.accept(new String[] {"Ram", "Priyanka"});
	
//		c1.accept("Chandrakant");
//		c1.accept("Priyanka");

		
		Consumer<int[]> c3= (j)->
		{
			for(int s:j)
			{
				System.out.println(s);
			}
		};
	

		c3.accept(new int[] {1,2,3,4,5,8,9,7,6});
		
	}
	
	
}
