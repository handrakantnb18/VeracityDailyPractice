package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class FindLengthOfString {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList(
				"Shivraj Priyanka Chandrakant Bhosle");
		
		str.stream()
		.map(String::length)
		.forEach(System.out::println);
		
	}
}
