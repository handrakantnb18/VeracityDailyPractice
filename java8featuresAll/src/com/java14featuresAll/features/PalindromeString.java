package com.java14featuresAll.features;

public class PalindromeString {

	public static void main(String[] args) {
		
//		String str = "ReeR";
		String str = "chandrakant";
		String rev = "";
		
		for(int i = str.length() - 1; i>=0;i--)
		{
			rev += str.charAt(i);
		}
		
		if(str.equals(rev))
			System.out.println("Paliandrom String.");
		else
			System.out.println("Not paliandrom String.");
		
	}
}
