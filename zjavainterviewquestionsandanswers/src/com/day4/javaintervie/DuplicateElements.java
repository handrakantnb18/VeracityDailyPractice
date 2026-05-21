package com.day4.javaintervie;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,65,45,12,32,15,25,35,18,19,18,12,78);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(n -> !set.add(n))
		.forEach(System.out::println);
		
		
		
	}
}
