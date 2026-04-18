package com.aone;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str = "chandraaknt";
		String result = "";
		
		for(char c : str.toCharArray())
		{
			if(result.indexOf(c) == -1)
			{
				result += c;
			}
		}
		System.out.println(result);
		
		
		
		// remove Duplicate String
		
		String str1 ="priyanka Bhosale";
		
		String result1 =" ";
		
		for(char c1 : str1.toCharArray())
		{
			if(result1.indexOf(c1) == -1)
			{
				result1 += c1;
			}
		}
		System.out.println(result1);
		
		String str2 ="i am from Sangli";
		
		String result2 =" ";
		
		for(char c2 :str2.toCharArray())
		{
			if(result2.indexOf(c2) == -1)
			{
				result2 += c2;
			}
		}
		System.out.println(result2);
		
		
		
	}
}
