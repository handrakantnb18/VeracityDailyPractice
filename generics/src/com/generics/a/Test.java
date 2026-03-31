package com.generics.a;


public interface Test<T, U> {

	void add(T t, U u);
	
	public static void main(String[] args) {
		
		Test<Integer, String> t1=(a,b)->
		{
			System.out.println(a);
			System.out.println(b);
		};
		
		t1.add(1, "Chandrakant");
		
	}
}
