package com.codingInterviewQTwo;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,15,30,35,55,80,70);
		
		list.stream()
		.map(s -> s + " ")
		.filter(s -> s.startsWith("1"))
		.forEach(System.out::println);
		
		
	}
}
