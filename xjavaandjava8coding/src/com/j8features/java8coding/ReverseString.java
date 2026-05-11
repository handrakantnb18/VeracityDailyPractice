package com.j8features.java8coding;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "chandrakant bhosale";
		
		String reverse = 
				new StringBuilder(str).reverse().toString();
		
		System.out.println(reverse);
		
		
	}
}
