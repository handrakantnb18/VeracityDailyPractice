package com.Day6.chatgpt;

public class CountWords {

	public static void main(String[] args) {
		
		String str = "java is a powerful programming language";
		
		String[] worlds = str.trim().split("\\s+");
		
		System.out.println("Total words : "+worlds.length);
		
		// 2
		
		String str1 = "my name is chandrakant bhosale, from sangli";
		
		String[] st = str1.trim().split("\\s+");
		
		System.out.println("Total words : "+st.length);
		
		
	}
}
