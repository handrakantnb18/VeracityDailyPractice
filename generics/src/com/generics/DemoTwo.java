package com.generics;

import java.util.Arrays;

public interface DemoTwo<T,U,R> {

	// T - First parameter
	// U - Second Parameter
	// R - Return type
	
	R fun(T t, U u);
	
	public static void main(String[] args) {
		
		// String is return type
		
//		DemoTwo<Integer,String,String> t1= (i,j) ->
//		{
//			return j;
//		};
//		
//		System.out.println(t1.fun(1, "chandrakant"));
		
//		DemoTwo<int[], int[], Integer> t2 = (i, j)->
//		{
//			System.out.println(Arrays.toString(i));
//			System.out.println(Arrays.toString(j));
//			
//			return 900;
//		};
//		
//		int x = t2.fun(new int[] {12,15,18,21}, new int[] {15,25,35,45});
//		
//		System.out.println(x);
		
		// with different data types
		
		DemoTwo<Integer, String[], String[]> t3 = (i,j)->
		{
			return j;
		};
		 
		String[] str=  t3.fun(45, new String[] {"chandr", "abc"});
		
		System.out.println(Arrays.toString(str));
		
		
	}
}
