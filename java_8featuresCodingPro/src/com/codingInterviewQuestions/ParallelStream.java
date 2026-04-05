package com.codingInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,5,8,9,7,6,4,3);
		
		list.parallelStream()
		.forEach(System.out::println);
		
	}
}
