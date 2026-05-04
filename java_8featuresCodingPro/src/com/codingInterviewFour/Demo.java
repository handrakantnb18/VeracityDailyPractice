package com.codingInterviewFour;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,45,25,50,35,88);
		int secondHighest =
				list.stream()
				.sorted()
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(secondHighest);
		
		
	}
}
