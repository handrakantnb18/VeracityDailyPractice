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
		
		
		String str2 = "priyanka Bhosale";
		String rev2 =" ";
		
		for(int i= str2.length() -1; i>= 0; i--)
		{
			rev2 += str2.charAt(i);
		}
		
		System.out.println(rev2);
		
		
		String str3 = "chandraaknt bhosale";
		
		String rev3 = " ";
		
		for(int j = str3.length() -1; j >= 0; j-- )
		{
			rev3 += str3.charAt(j);
		}
		
		System.out.println(rev3);
		
	}
}
