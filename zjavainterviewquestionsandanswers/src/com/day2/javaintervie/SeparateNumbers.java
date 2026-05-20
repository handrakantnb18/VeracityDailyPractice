package com.day2.javaintervie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				5,6,3,2,8,7,9,2,1,7,8,15,88,99,33,65);
		
		Map<Boolean, List<Integer>> partitionaed =
				list.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
		
		System.out.println("Even Numbers : "+partitionaed.get(true));
		System.out.println("Odd Numbers : "+partitionaed.get(false));
		
		System.out.println("======================================");
		
		List<Integer> list1 = Arrays.asList(
				77,88,99,55,22,114,11,44,66,33,15,25,35,75,85,95);
		
		Map<Boolean, List<Integer>> map =
				list1.stream()
				.collect(Collectors.partitioningBy(a -> a % 2 == 0));
		
		System.out.println("Even Numbers : "+map.get(true));
		System.out.println("Odd Numbers : "+map.get(false));
		
		
		System.out.println("======================================");

		List<Integer> list2 = Arrays.asList(
				15,25,35,45,55,56,57,58,59,44,66,22,82,46,37);
		
		Map<Boolean, List<Integer>> map2 =
				list2.stream()
				.collect(Collectors.partitioningBy(b -> b % 2 == 0));
		
		System.out.println("Even Numbers : "+map2.get(true));
		System.out.println("Odd Numbers : "+map2.get(false));
		
		
	}
}
