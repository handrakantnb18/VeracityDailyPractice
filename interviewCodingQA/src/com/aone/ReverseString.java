package com.aone;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "Chandraaknt";
		String rev = "";
		
		for(int i= str.length() -1; i>= 0; i--)
		{
			rev += str.charAt(i);
		}
		System.out.println(rev);
		
		String str1 = "Priyanka";
		
		String rev1 = "";
		
		for(int i = str1.length() - 1; i >=0; i--)
		{
			rev1 += str1.charAt(i);
		}
		
		System.out.println(rev1);

		
		
	}
	
	
}
