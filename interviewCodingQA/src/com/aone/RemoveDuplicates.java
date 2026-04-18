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
		
		
	}
}
