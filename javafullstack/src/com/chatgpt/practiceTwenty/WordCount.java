package com.chatgpt.practiceTwenty;

public class WordCount {

	public static void main(String[] args) {
		// Count Words in a String
		
		String str = "Java is a Powerful language";
		
		String[] words = str.trim().split(" ");
		
		System.out.println("Word count : "+words.length);
	}
}
