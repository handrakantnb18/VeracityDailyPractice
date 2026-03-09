package com.twentyImpquestionsand;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String name = "chandraknt bhosale";
		String name1 = " ";
		
		for(int i =0; i < name.length(); i++)
		{
			char ch = name.charAt(i);
			
			if(name1.indexOf(ch) == -1)
			{
				name1 += ch;
			}
		}
		System.out.println(name1);
	}
}
