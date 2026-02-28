package com.linedin.coding;

public class ReverseStringLoop {

	public static void main(String[] args) {
		
		// different ways to reverse a string in Java Using for loop
		
		String str = "Chandrakant Bhosale";
		String reverse = " ";
		
		for (int i = str.length() - 1; i >= 0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reverse String : "+reverse);
	}
}
