package com.codingInterviewQTwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(10,100, 20,15,20,30,15,25,50,60,40,80);
		
		Set<Integer> set = new HashSet();
		list1.stream()
		.filter(n -> !set.add(n))
		.forEach(System.out::println);
		
		
		public static void getDataWithoutDuplicates()
		{
			List<Integer> list2 = Arrays.asList(1,1,25,20,20,56,56,4,3,8);
			Set<Integer> set1 = new HashSet<>(list2);
			
			List<Integer> uniqData = set1.stream().collect(Collectors.toList());
			
			uniqData.forEach(System.out::println);
		}
	}
}
