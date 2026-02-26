package com.methods;

public class SimpleTwo {

	// 2) method with no return type and within parameter
	
	void add(int a)  // parameters
	{
		//int b;
		System.out.println("Within parameter "+a);
		
	}
	
	public static void main(String[] args) {
		
		SimpleTwo s1 = new SimpleTwo();
		s1.add(100);
	}
}
