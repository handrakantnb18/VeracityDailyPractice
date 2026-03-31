package com.generics.a;

import java.util.Arrays;

public interface Test<T, U> {

	void add(T t, U u);
	
	public static void main(String[] args) {
		
		Test<Integer, String> t1=(a,b)->
		{
			System.out.println(a);
			System.out.println(b);
		};
		
		t1.add(1, "Chandrakant");
		
		Test<Float, Boolean> d2=(x,y)->
		{
			System.out.println(x);
			System.out.println(y);
		};
		d2.add(55.45f, true);
		
		Test<Integer, int[]> d3=(x,y)->
		{
			System.out.println(x);
			System.out.println(Arrays.toString(y));
		};
		d3.add(55, new int[] {78, 89, 45, 56});
		
	}
}
