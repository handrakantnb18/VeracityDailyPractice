package com.j8features.java8coding;

public class CountVowels {

	public static void main(String[] args) {

		// Count Vowels and Consonants

		String str = "Java Programming".toLowerCase();

		int vowels = 0;
		int consonants = 0;

		for (char ch : str.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				if ("aeiou".indexOf(ch) != -1) {
					vowels++;
				} else {
					consonants++;
				}
			}
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);

	}
}
