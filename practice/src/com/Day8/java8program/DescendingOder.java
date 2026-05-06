package com.Day8.java8program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DescendingOder {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 2, 8, 1, 3);
		
		list.stream()
	    .sorted(Comparator.reverseOrder())
	    .forEach(System.out::println);	
	}
}
