package com.day4.javaintervie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				10,15,45,78,98,35,25,65,98);
		
		list.stream()
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
		
		System.out.println("=========================");
		
		int[] arr = {45,56,78,98,32,15,65,25,35,95};
		
		Map<Boolean, List<Integer>> list1 =
				Arrays.stream(arr)
				.boxed()
				.collect(Collectors.partitioningBy(num -> num % 2 == 0));
		
		System.out.println(list1);
				
	}
}
