package com.codingInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElements {

	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,2,5,4,8);
		
		list.stream()
			.distinct()
			.forEach(System.out::println);
		
	}
}
