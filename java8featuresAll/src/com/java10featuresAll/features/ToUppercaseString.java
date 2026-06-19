package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class ToUppercaseString {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList(
				"chandrakant", "Priyanka","Shivraj", "bhosale");
		
		str.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
	}
}
