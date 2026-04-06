package com.codingInterviewQTwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(10,100, 20,15,20,30,15,25,50,60,40,80);
		
		Set<Integer> set = new HashSet();
		list1.stream()
		.filter(n -> !set.add(n))
		.forEach(System.out::println);
		
		
	}
}
