package com.chatgpt.practice;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a string
		
		String s = "Chandrakant";
		String reverse = " ";
		
		for (int i = s.length() - 1; i >= 0; i--)
		{
			reverse += s.charAt(i);
		}
		
		System.out.println("Reverse string : "+reverse);
	}
}
