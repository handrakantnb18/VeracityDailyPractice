package com.day4.javaintervie;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				10,12,15,18,79,85,65,45,35);
		
		list.stream()
		.map(s -> s + " ")
		.filter(s -> s.startsWith("1"))
		.forEach(System.out::println);
		
		
	}
}
