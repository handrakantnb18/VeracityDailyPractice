package com.java9featuresAll.features;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "reel";
		String rev = new StringBuilder(str).reverse().toString();

		if(str.equals(rev))
		    System.out.println("String is Palindrome");
		else
		    System.out.println("String is Not Palindrome");
	}
}
