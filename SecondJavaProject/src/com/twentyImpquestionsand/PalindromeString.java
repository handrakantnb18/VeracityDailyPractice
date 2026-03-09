package com.twentyImpquestionsand;

public class PalindromeString {

	public static void main(String[] args) {
		String name = "SAAS";
		String rev = " ";
		
		for(int i = name.length() - 1; i >= 0; i--)
		{
			rev += name.length();
		}
		
		if(name.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
