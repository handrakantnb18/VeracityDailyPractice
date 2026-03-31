package com.generics;


// generics

public interface Demo<T> {

	void add(T t1, T t2); // using generics type (T - is a type)
	
	public static void main(String[] args) {
		
		Demo<Integer> demo1=(a,b)->
		{
			System.out.println(a+b);
		};
		demo1.add(45, 59);
		
		Demo<Float> demo2=(a,b) ->
		{
			System.out.println(a+b);
		};
		
		demo2.add(55.56f, 45.89f);
	
		Demo<Double> demo3=(a,b)->
		{
			System.out.println(a+b);
		};
		
		demo3.add(88.55, 66.23);
				
	}
	
}
