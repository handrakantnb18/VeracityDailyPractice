package com.codingInterviewQTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,15,30,35,55,80,70);
		
		list.stream()
		.map(s -> s + " ")
		.filter(s -> s.startsWith("1"))
		.forEach(System.out::println);
		
		
		int[] arr = {10,20,15,35,60,50,55,45};
		List<String> list2 = Arrays.stream(arr).boxed()
				.map(s -> s + "")
				.filter(s -> s.startsWith("5"))
				.collect(Collectors.toList());
		
		System.out.println(list2);
		
		
	}
}
