package com.Day5.streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(45,25,45,22,12,22,56,88,88,91,19,91);
		
		Set<Integer> set = new HashSet<Integer>();
		
		System.out.println("Duplicate Elements : ");

		list.stream()
		.filter(n -> !set.add(n))
		.forEach(System.out::println);
		
		System.out.println("Duplicate Elements : ");
		List<Integer> list1 = Arrays.asList(11,23,23,55,45,55,78,89,78);
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		list1.stream()
		.filter(a ->  !set1.add(a))
		.forEach(System.out::println);
		
		System.out.println("Non-Duplicate Elements : ");
		list1.stream()
		.filter(b -> set.add(b))
		.forEach(System.out::println);
		
		
	}
}
