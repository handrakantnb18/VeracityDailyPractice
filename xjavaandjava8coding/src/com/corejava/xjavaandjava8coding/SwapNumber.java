package com.corejava.xjavaandjava8coding;

public class SwapNumber {

	public static void main(String[] args) {
		
		int a = 15;
		
		int b = 25;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a);
		
		System.out.println(b);
	}
}
