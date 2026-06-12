package com.day1.java8featuresAll.features;

import java.util.Arrays;

public class ReverseString {

	// Reverse a String
	public static void main(String[] args) {
		
		String str = "Java";

		String reverse = Arrays.stream(str.split(""))
		                       .reduce("", (a,b) -> b + a);

		System.out.println(reverse);
		
	}
}
