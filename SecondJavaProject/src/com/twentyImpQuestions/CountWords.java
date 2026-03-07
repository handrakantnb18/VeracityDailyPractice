package com.twentyImpQuestions;

public class CountWords {

	public static void main(String[] args) {
		String str = "Chandrakant bhosale from pune";
		String words[] = str.split(" ");
		
		System.out.println("Count words : "+words.length);
	}
}
