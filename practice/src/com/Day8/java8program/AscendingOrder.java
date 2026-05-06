package com.Day8.java8program;

import java.util.Arrays;
import java.util.List;

public class AscendingOrder {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 2, 8, 1, 3);

		list.stream()
		    .sorted()
		    .forEach(System.out::println);
	}
}
