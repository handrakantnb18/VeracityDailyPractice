package com.predefinedjavagenerics;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
//		Function<Integer, String> f =(i) ->
//		{
//			return "Chandrakant";
//		};
//		
//		System.out.println(f.apply(100));
//		
		
//		Function<Integer, Integer> f =(i) ->i;
//				
//		System.out.println(f.apply(100));
//		
		
//		Function<Integer, int[]> f =(i) -> new int[] {1,2,3,4,5,6};
//		
//		int[] arr=f.apply(222);
//		
//		for(int i:arr)
//		{
//			System.out.println(i);
//		}
		
//		System.out.println(f.apply(100));
		
		Function<Student, Student> f=(a)->
		{
			return a;
			// return new Student(1, "Ram", 54.60);
		};
		
		System.out.println(f.apply(new Student(2, "Chandrakant", 55.50)));
		
		
		
	}
}
