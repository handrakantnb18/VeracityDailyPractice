package com.linedin.coding;

public class ReverseString {

	public static void main(String[] args) {
		
		
		// different ways to reverse a string in Java Using StringBuilder
		
		String str = "Chandrakant";
		
		String reverse = new StringBuilder(str).reverse().toString();
		
		System.out.println("Original String : "+str);
		System.out.println("Reverse string  : "+reverse);
		
	}
}
