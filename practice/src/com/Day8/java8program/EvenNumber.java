package com.Day8.java8program;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,4,6,8,10, 15, 20, 25, 30);

		list.stream()
		    .filter(n -> n % 2 == 0)
		    .forEach(System.out::println);
	}
}
