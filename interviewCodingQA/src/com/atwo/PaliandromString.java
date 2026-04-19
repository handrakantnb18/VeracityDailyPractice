package com.atwo;

public class PaliandromString {

	
	public static void main(String[] args) {
		
		String str = "madamji";
		
		String rev = new StringBuilder(str).reverse().toString();
		
		if(str.equals(rev)) {
			System.out.println("Paliondrom String");
		}
		else {
			System.out.println("Not paliondrom String");
		}
		
		System.out.println("-----------------");
		
		String str1 = "madam";
		
		String rev1 = new StringBuilder(str1).reverse().toString();
		
		if(str1.equals(rev1))
		{
			System.out.println("Paliondrom String");
		}
		else
		{
			System.out.println("Not paliandrom String");
		}
		
	}
	
	
}

