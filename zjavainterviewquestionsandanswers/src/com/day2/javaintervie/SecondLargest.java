package com.day2.javaintervie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

public class SecondLargest {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 2, 45, 98, 35, 78, 16, 89, 34);

		int secondHeight = 
				list.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("List does not have enough elements "));

		System.out.println("Second Largest : " + secondHeight);

		System.out.println("========================================");

		List<Integer> list1 = Arrays.asList(12, 45, 78, 98, 65, 32, 25, 14, 36, 74, 85, 96, 99);

		int secondHeighest1 =
				list1.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("List not find."));

		System.out.println("Second Heighest : "+secondHeighest1);

	}
}
