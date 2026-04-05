package com.codingInterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHiegest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(45,25,12,55,69,58,22,11);
		
		Integer secondHigh =
		list.stream()
		.distinct()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst()
		.get();
		
		System.out.println(secondHigh);
		
	}
	
	
}
