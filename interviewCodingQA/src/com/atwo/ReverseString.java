 package com.atwo;

public class ReverseString {

	public static void main(String[] args) {
		
		String str1 = "chandrakant";
		String rev = " ";
		
		for(int i=str1.length() -1; i>=0; i--)
		{
			rev += str1.charAt(i);
		}
		System.out.println(rev);
	}
}
