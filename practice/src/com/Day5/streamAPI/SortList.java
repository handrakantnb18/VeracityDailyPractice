package com.Day5.streamAPI;

import java.util.Arrays;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(22,5,12,80,10,12,23,25,45,65,88,78);
		
		System.out.println("First List : ");
		list.stream()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("Second list : ");
		
		List<Integer> list1 = Arrays.asList(55,23,88,4,56,12,10);
		
		list1.stream()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("Third List : ");
		
		List<Integer> list2 = Arrays.asList(88,77,56,12,94,10,35,25);
		
		list2.stream()
		.sorted()
		.forEach(System.out::println);
		
		
	}
}
