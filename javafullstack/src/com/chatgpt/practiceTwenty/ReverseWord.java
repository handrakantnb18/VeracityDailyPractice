package com.chatgpt.practiceTwenty;

public class ReverseWord {

	public static void main(String[] args) {
		// Reverse Words in a Sentence
		
		String str = "Java is Powerfull language";
		String[] words = str.split(" ");
		
		String result = " ";
		
		for (int i = words.length - 1; i >= 0; i--)
			result += words[i] + " ";
		
		System.out.println(result.trim());
	}
}
