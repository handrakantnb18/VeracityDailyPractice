package com.Day5.streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListDescending {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,10,90,55,88,26,49,5);
		
		System.out.println("First List : ");
		list.stream()
		.sorted(Collections.reverseOrder())
		.forEach(System.out::println);
		
		List<Integer> list1 = Arrays.asList(8,25,23,11,15,10,79,30,45,90);
		
		System.out.println("Second List : ");
		list1.stream()
		.sorted(Collections.reverseOrder())
		.forEach(System.out::println);
		
		List<Integer> list2 = Arrays.asList(78,4,99,80,12,35,9,37,49);
		
		System.out.println("Third List : ");
		list2.stream()
		.sorted(Collections.reverseOrder())
		.forEach(System.out::println);
		
	}
}
