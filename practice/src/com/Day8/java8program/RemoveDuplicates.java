package com.Day8.java8program;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		// Remove duplicates
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

		list.stream()
		    .distinct()
		    .forEach(System.out::println);
	}
}
