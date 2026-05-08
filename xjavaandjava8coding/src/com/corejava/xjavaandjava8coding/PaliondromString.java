package com.corejava.xjavaandjava8coding;

public class PaliondromString {

	public static void main(String[] args) {
		
//		String str = "seen"; // not
		
		String str = "madam";
		
		String reverse =
				new StringBuilder(str).reverse().toString();
		
		if(str.equals(reverse))
		{
			System.out.println("paliondrom String");
		}
		else
		{
			System.out.println("Not paliondrom String");
		}
	}
}
