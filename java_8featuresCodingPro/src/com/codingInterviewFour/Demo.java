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
		
		List<Integer> list3 = Arrays.asList(11,22,33,44,55,66,77,88,99);
		
		int secondHeighest3 =
				list3.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(secondHeighest3);
		
		List<Integer> list4 = Arrays.asList(10,20,30,40,50,60,70,80,90,100);
		
		int secondHieght4 = 
				list4.stream()
				.sorted()
				.skip(2)
				.findFirst()
				.get();
		
		System.out.println(secondHieght4);
		
		
		List<Integer> list5 = Arrays.asList(56,25,35,478,98,65,73,82);
		
		int duplicate =
				list5.stream()
				.sorted()
				.skip(3)
				.findFirst()
				.get();
		
		System.out.println(duplicate);
		
		
	}
}
