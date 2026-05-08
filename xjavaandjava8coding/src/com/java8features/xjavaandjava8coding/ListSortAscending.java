package com.java8features.xjavaandjava8coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSortAscending {

	public static void main(String[] args) {
		
		//  Sort List Ascending
		List<Integer> list = Arrays.asList(1,2,3,4,5,88,79,
				22,45,65,35,10,14,11);
		
		list.stream()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("=============");
		
		
		// Sort List Descending
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,88,79,
				22,45,65,35,10,14,11);
		
		list1.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
		
		
		
	}
}
