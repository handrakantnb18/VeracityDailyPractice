package com.corejava.xjavaandjava8coding;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Chandrakant bhosale";
		
		String reverse =
				new StringBuilder(str).reverse().toString();
		
		System.out.println(reverse);
		
		String str1 = "priyanka bhosale";
		
		String rev =
				new StringBuilder(str1).reverse().toString();
		
		System.out.println(rev);
		
		
	}
}
