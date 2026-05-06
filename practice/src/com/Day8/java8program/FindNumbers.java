package com.Day8.java8program;

import java.util.Arrays;
import java.util.List;

public class FindNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 10, 25, 30, 15);

		list.stream()
		    .filter(n -> n > 20)
		    .forEach(System.out::println);
	}
}
