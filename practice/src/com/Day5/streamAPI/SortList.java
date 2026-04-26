package com.Day5.streamAPI;

import java.util.Arrays;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(22,5,12,80,10,12,23,25,45,65,88,78);
		
		list.stream()
		.sorted()
		.forEach(System.out::println);
		
	}
}
