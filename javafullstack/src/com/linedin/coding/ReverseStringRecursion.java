package com.linedin.coding;

public class ReverseStringRecursion {

	// different ways to reverse a string in Java Using Recursion
	
	public static String reverse(String str)
	{
		if (str.isEmpty())
			return str;
		
		return reverse(str.substring(1)) + str.charAt(0);
		
	}
	
	public static void main(String[] args) {
		
		String str = "Bhosale Chandrakant";
		System.out.println("Reverse string : "+reverse(str));
		
	}
}
