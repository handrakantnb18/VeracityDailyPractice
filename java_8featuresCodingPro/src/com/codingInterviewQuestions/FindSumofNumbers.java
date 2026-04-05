package com.codingInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class FindSumofNumbers {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(8,5,88,55,56,3,25,15);
		
		int sum = num.stream()
		.mapToInt(Integer::intValue)
		.sum();
		
		System.out.println(sum);
		
	}
}
