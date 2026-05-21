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
		
		
		public static void getDataWithOutDuplicates()
		{
			List<Integer> list1 = Arrays.asList(
					12,15,14,18,15,19,25,22,35,25,14);
			
		     list1.stream()
		     .distinct()
		     .forEach(noDuplicateData -> 
		     System.out.println(noDuplicateData));
		     
		}
			
			
//			Set<Integer> set = new HashSet<Integer>(list1);
//			
//			List<Integer> 
//		}
		
	}
}
