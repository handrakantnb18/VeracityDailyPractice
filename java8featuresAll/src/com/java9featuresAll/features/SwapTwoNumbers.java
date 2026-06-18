package com.java9featuresAll.features;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a = 15, b = 95;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a + " " + b);
	}
}
