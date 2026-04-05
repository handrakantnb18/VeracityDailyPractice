package com.codingInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumNumber {

	public static void main(String[] args) {
		
		List<Integer> num = 
				Arrays.asList(25,15,89,45,85,35,99,79);
		
		Optional<Integer> max = 
				num.stream().max(Integer::compare);
		
		System.out.println(max.get());
		
	}
}
