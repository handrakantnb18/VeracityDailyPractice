package com.generics;


// generics

public interface Demo<T> {

	void add(T t1, T t2); // using generics
	
	public static void main(String[] args) {
		
		Demo<Integer> demo1=(a,b)->
		{
			System.out.println(a+b);
		};
		demo1.add(45, 59);
	}
	
}
