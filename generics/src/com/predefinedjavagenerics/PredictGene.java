package com.predefinedjavagenerics;

import java.util.function.Predicate;

public class PredictGene {

	//void test(T t);
	
	public static void main(String[] args) {
		
		// boolean value - true or false
		
//		Predicate<Integer> p = (a)->
//		{
//			//return a > 20;
//			return a % 2 == 0;
//			
//			//return a.
//		};
//		
//		boolean b = p.test(100);
//		System.out.println(b)

		Predicate<String> p = (a)->
		{
			
			//return a.length() > 5;
			
			// return a.startsWith("C");
			// return a.equals("Chandrakant");
			
			return a.contains(a);
			
		};
		
		boolean b = p.test("Chandrakant");
		System.out.println(b);
	}
}
