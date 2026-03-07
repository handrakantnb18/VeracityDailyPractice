package com.twentyImpQuestions;

public class CheckPalindromeString {

	public static void main(String[] args) {
		String str = "madam";
		String rev = " ";
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			rev += str.charAt(i);
			
		}
		
		if (str.equals(rev))
			System.out.println("Paliondrom number..");
		else
			System.out.println("Not paliondrom..");
	}
}
