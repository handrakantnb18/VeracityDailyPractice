package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class ToLowerCaseString {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList(
				"CHANDRAKANT", "PRIYANKA", "SHIVRAJ", "BHOSALE");
		
		str.stream()
		.map(String::toLowerCase)
		.forEach(System.out::println);
		
	}
}
