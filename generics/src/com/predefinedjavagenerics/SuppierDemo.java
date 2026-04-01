package com.predefinedjavagenerics;

import java.util.Arrays;
import java.util.function.Supplier;

public class SuppierDemo {

	public static void main(String[] args) {
		
		
		 // integer wrapper class
		
//		Supplier<Integer> a=() ->
//		{
//			return 100;
//		};
//		
//		System.out.println(a.get());
//		
//		// String wrapper class
//		
//		Supplier<String> s =()->
//		{
//			return "Chandraknt";
//			
//		};
//		
//		System.out.println(s.get());
		
		Supplier<int[]> s = () ->
		{
			return new int[] {1, 2,3,4,5,6,7};
		};
		
		System.out.println(Arrays.toString(s.get()));
		
		Supplier<String[]> s1 = () ->
		{
			return new String[] {"A","B","C","D","E"};
		};
		
		System.out.println(Arrays.toString(s1.get()));
		
		
		
	}
}
