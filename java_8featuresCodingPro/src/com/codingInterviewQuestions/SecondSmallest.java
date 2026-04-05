package com.codingInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondSmallest {

	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(25,15,45,78,98,55,65,35);
		
		Integer secondSmall = 
		list.stream()
		.distinct()
		.sorted()
		.skip(1)
		.findFirst()
		.get();
		
		System.out.println(secondSmall);
		
	}
}
