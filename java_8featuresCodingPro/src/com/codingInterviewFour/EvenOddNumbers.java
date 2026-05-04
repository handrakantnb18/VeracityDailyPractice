package com.codingInterviewFour;

import java.util.Arrays;
import java.util.List;

public class EvenOddNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,
				11,12,13,14,15,16,17,18,19,20);
		
		long count =
				list.stream()
				.filter(n -> n % 2 == 0)
				.count();
		
		System.out.println(count);
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10
				,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25);
		
		long count1 =
				list1.stream()
				.filter(m -> m % 2 != 0)
				.count();
		
		System.out.println(count1);
		
		
		
	}
}
