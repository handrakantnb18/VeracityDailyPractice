package com.j8features.java8coding;

public class SwapTwoNumbres {

	public static void main(String[] args) {
		
		// Swap Two Numbers Without Third Variable
		
		int num1 = 100;
		int num2 = 200;
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println(num1);
		System.out.println(num2);
		
		
	}
}
