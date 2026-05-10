package com.java8features.xjavaandjava8coding;

import java.util.Arrays;
import java.util.List;

public class ConvertUppercase {

	public static void main(String[] args) {
		
		// Convert String to Uppercase
		
		List<String> names = Arrays.asList("Java", "is", "a","Programming","Number");
		
		names.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		System.out.println("========");
		
		names.stream()
		.map(String::toLowerCase)
		.forEach(System.out::println);
		
		
		
	}
}
