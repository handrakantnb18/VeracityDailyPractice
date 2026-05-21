package com.day4.javaintervie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				10,12,15,18,79,85,65,45,35);
		
		list.stream()
		.map(s -> s + " ")
		.filter(s -> s.startsWith("1"))
		.forEach(System.out::println);
		
		int[] arr = {10,15,12,13,18,45,78,98,65,35};
		
		List<String> list1 =
				Arrays.stream(arr)
				.boxed()
				.map(s -> s +" ")
				.filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());
		
		System.out.println(list1);
		
		
		
	}
}
