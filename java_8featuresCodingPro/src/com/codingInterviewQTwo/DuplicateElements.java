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
		
		
		// 1
//		public static void getDataWithoutDuplicates()
//		{
//		     List<Integer> myList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
//		     myList.stream().distinct().forEach(noDuplicateData -> System.out.println(noDuplicateData));
//		 }
		
		// 2
//		public static void getDataWithoutDuplicates()
//		{
//			List<Integer> list3 = Arrays.asList(1,1,25,20,20,56,56,4,3,8);
//			Set<Integer> set1 = new HashSet<>(list3);
//			
//			List<Integer> uniqData = set1.stream().collect(Collectors.toList());
//			
//			uniqData.forEach(System.out::println);
//		}
		
		
		int[] arr = {10,15,20,25,45,55,60,80,90};
		
		List<Integer> list = Arrays.stream(arr).boxed().distinct()
				.collect(Collectors.toList());
		
		
	}
}
