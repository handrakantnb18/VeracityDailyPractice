package com.aone;

public class PaliandromString {

	public static void main(String[] args) {
		
		String str = "madam";
		
		String rev = new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev))
		{
			System.out.println("Paliandrom");
		}
		else {
			System.out.println("Not paliandrom");
		}
	}
}
