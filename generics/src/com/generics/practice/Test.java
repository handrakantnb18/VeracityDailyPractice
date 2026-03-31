package com.generics.practice;

public interface Test {

	void add(int a, int b);

	
	
	public static void main(String[] args) {
		
		Test t = (a, b) ->
		{
			System.out.println("Addition : "+(a+b));
		};
		
		t.add(55, 25);
	}
}