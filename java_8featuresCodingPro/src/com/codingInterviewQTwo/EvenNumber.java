package com.codingInterviewQTwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,25,35,40,50,60,55,65);
		
		list.stream()
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
		
		 int[] arr = {10,20,30,25,35,40,50,60,55,65};

		
		Map<Boolean,List<Integer>> list1 = Arrays.stream(arr).boxed()
				.collect(Collectors.partitioningBy(num -> num % 2 == 0));
		
		System.out.println(list);
		
		
	}
}
