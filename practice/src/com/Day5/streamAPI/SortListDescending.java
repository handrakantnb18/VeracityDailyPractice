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
		
		
	}
}
