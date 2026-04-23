package com.Day4.practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(22,15,35,85,64,77,98);
		
		Map<Boolean, List<Integer>> map =
				list.stream()
				.collect(Collectors.partitioningBy(
						n -> n % 2 == 0));
		
		System.out.println(map);
		
		List<Integer> list1 = Arrays.asList(22,15,35,85,64,77,98);

		Map<Boolean, List<Integer>> map1 =
				list1.stream()
				.collect(Collectors.partitioningBy(
						n -> n % 2 != 0));
		
		System.out.println(map1);
		
		
	}
}
