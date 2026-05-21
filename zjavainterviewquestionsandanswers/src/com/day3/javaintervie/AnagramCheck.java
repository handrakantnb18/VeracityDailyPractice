package com.day3.javaintervie;

import com.day1.javaintervie.ReverseString;

public class AnagramCheck {

	public static void main(String[] args) {
		
		String str = "Chandraaknt bhosale";
		
		System.out.println(reverse(str));
	}
	
	public static String reverse(String in)
	{
		if(in == null)
			return null;
		
		StringBuilder out = new StringBuilder();
		char[] chars = in.toCharArray();
		
		for(int i = chars.length - 1; i >= 0; i--)
		{
			out.append(chars[i]);
		}
		return out.toString();
	}
}
