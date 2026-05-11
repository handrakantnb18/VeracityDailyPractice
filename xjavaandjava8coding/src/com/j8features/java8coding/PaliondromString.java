package com.j8features.java8coding;

public class PaliondromString {

	public static void main(String[] args) {
		
		String str = "madam";
		
		String reverse = 
				new StringBuilder(str).reverse().toString();
		
		if(str.equals(reverse))
		{
			System.out.println("Paliondrom String");
		}
		else
		{
			System.out.println("Not paliondrom String");
		}
	}
}
