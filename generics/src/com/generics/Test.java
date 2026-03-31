package com.generics;

import java.util.Arrays;

public interface Test<T> {

	void fun(T t);
	
	public static void main(String[] args) {
		
		Test<String> d1=(name)->
		{
			System.out.println(name);
		};
		
		d1.fun("chandrakant");
		
		Test<Integer> d2=(a)->
		{
			System.out.println(a);
		};
		
		d2.fun(5000);
		
		Test<Float> d3=(f)->
		{
			System.out.println(f);
		};
		
		d3.fun(55.23f);
		
		Test<int[]> d4=(b)->
		{
			System.out.println(Arrays.toString(b));
		};
		
		d4.fun(new int[] {1,2,3,4,5,});
	}
}
