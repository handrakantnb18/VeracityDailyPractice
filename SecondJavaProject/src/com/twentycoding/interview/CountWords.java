package com.twentycoding.interview;

public class CountWords {

	public static void main(String[] args) {
		
		String str = "Priyanka chandraaknt bhosale";
        String words[] = str.split(" ");

        System.out.println("Word count: " + words.length);
	}
}
