package com.Day6.chatgpt;

public class CountWords {

	public static void main(String[] args) {
		
		String str = "java is a powerful programming language";
		
		String[] worlds = str.trim().split("\\s+");
		
		System.out.println("Total words : "+worlds.length);
		
	}
}
