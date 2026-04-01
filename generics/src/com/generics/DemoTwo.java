package com.generics;

public interface DemoTwo<T,U,R> {

	// T - First parameter
	// U - Second Parameter
	// R - Return type
	
	R fun(T t, U u);
	
	public static void main(String[] args) {
		
		DemoTwo<Integer,String,String> t1= (i,j) ->
		{
			return j;
		};
		
		System.out.println(t1.fun(1, "chandrakant"));
	}
}
