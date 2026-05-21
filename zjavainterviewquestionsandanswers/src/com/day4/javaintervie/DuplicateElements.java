package com.day4.javaintervie;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				78,98,65,45,12,32,15,25,35,18,19,18,12,78);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(n -> !set.add(n))
		.forEach(System.out::println);
		
		
//		public static void getDataWithOutDuplicates()
//		{
//			List<Integer> list1 = Arrays.asList(
//					12,15,14,18,15,19,25,22,35,25,14);
//			
//		     list1.stream()
//		     .distinct()
//		     .forEach(noDuplicateData -> 
//		     System.out.println(noDuplicateData));
//		     
//		}
		
		
			 List<Integer> myList = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
		      Set<Integer> set1 = new HashSet<>(myList);
		        
		      List<Integer> uniqueData = set1.stream().collect(Collectors.toList());
		        
		      uniqueData.forEach(System.out::println);
		
			
//			Set<Integer> set = new HashSet<Integer>(list1);
//			
//			List<Integer> 
//		}
		
	}
}
