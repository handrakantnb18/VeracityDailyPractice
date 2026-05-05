package com.Day6.chatgpt;

public class PrintEach {

	public static void main(String[] args) {
		
		String str1 = "java is easy to learn";
		
		String[] words = str1.split("\\s+");
		
		for(String word : words)
		{
			System.out.println(word);
		}
	}
}
