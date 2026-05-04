package com.codingInterviewFour;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,45,25,50,35,88);
		int secondHighest =
				list.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(secondHighest);
		
		List<Integer> list2 = Arrays.asList(45,25,35,85,95,65,75,55);
		
		int secondHighest2 =
				list2.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(secondHighest2);
		
		
	}
}
