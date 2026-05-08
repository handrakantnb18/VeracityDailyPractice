package com.java8features.xjavaandjava8coding;

import java.util.Arrays;
import java.util.List;

public class OddNumbers {

	public static void main(String[] args) {
		
		// Find Odd Numbers
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,
				9,10,11,12,13,14,15,16,17,18,19,20);
		
		list.stream()
		.filter(n -> n % 2 != 0)
		.forEach(System.out::println);
		
		System.out.println("===========");
		
		//  Find Even Numbers
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,
				9,10,11,12,13,14,15,16,17,18,19,20,21,22);
		
		list1.stream()
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
		
		
	}
}
