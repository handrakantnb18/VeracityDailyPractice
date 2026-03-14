package com.twentycoding.interview;

public class Reverse {

	public static void main(String[] args) {
		String str = "Chandrakant bhosale";
		String rev = " ";
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Reversed String : "+rev);
	}
}
