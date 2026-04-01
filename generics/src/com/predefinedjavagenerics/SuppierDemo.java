package com.predefinedjavagenerics;

import java.util.function.Supplier;

public class SuppierDemo {

	public static void main(String[] args) {
		
		
		 // integer wrapper class
		
		Supplier<Integer> a=() ->
		{
			return 100;
		};
		
		System.out.println(a.get());
		
		// String wrapper class
		
		Supplier<String> s =()->
		{
			return "Chandraknt";
			
		};
		
		System.out.println(s.get());
	}
}
