package com.Day6.chatgpt;

public class PrintEach {

	public static void main(String[] args) {
		
		String str1 = "java is easy to learn";
		
		String[] words = str1.split("\\s+");
		
		for(String word : words)
		{
			System.out.println(word);
		}
		
		System.out.println("====================");
		System.out.println("");
		String str2 = "java is object oriented programming language";
		
		String[] words1 = str2.split("\\s+");
		
		for(String wo : words1)
		{
			System.out.println(wo);
		}
		
		
	}
}
