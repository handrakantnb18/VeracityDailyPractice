package com.corejava.xjavaandjava8coding;

public class CountVowels {

	public static void main(String[] args) {
		
		String str = "Java is a programming language".toLowerCase();
		
		int vowels = 0;
		int constraints = 0;
		
		for(char ch : str.toCharArray())
		{
			if(ch >= 'a' && ch <= 'z' )
			{
				if("aeiou".indexOf(ch) != -1)
				{
					vowels++;
				}
				else
				{
					constraints++;
				}
			}
		}
		
		System.out.println("Vowels : "+vowels);
		
		System.out.println("Constraints : "+constraints);
		
		
	}
}
