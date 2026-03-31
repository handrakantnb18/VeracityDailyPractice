package com.generics;

public interface Test<T> {

	void fun(T t);
	
	public static void main(String[] args) {
		
		Test<String> d1=(name)->
		{
			System.out.println(name);
		};
		
		d1.fun("chandrakant");
		
		
	}
}
