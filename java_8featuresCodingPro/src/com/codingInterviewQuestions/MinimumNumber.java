package com.codingInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinimumNumber {

	public static void main(String[] args) {
		
		// min numbers
		
		List<Integer> num = Arrays.asList(25,12,10,15,48,79,88,35,56);
		
		Optional<Integer> min = num.stream().min(Integer::compare);
		
		System.out.println(min.get());
		
		
	}
}
