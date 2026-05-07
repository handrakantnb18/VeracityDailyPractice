package com.Day8.java8program;

import java.util.Arrays;
import java.util.List;

public class FindFirstElements {

	public static void main(String[] args) {
		
		// Find first element
		List<String> list = Arrays.asList("Java", "Spring", "Hibernate");

		String first = list.stream()
		                   .findFirst()
		                   .get();

		System.out.println(first);
	}
}
