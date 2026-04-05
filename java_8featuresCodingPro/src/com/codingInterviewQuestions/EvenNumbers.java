package com.codingInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		
		list.stream()
		.filter(n -> n % 2 == 0 )
		.forEach(System.out::println);
		
	}
}
