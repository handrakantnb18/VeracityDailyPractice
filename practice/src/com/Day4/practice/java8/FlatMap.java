package com.Day4.practice.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		
		List<List<Integer>> list = Arrays.asList(
				Arrays.asList(1,2),
				Arrays.asList(3, 4)
				);
		
		List<Integer> result =
				list.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		
		System.out.println(result);
		
		System.out.println("---------------------------------------------------");
		
		
		List<List<Integer>> list1 = Arrays.asList(
				Arrays.asList(1,2,3,4,5),
				Arrays.asList(6,7,8,9)
				);
		
		List<Integer> res = 
				list1.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		
		System.out.println(res);
		
		System.out.println("-----------------------------------------");
		
		
		List<List<Integer>> list2 = Arrays.asList(
				Arrays.asList(10,12,13,44,25),
				Arrays.asList(16,77,18,89)
				);
		
		List<Integer> res2 = 
				list2.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		
		System.out.println(res2);
		
	}
}
