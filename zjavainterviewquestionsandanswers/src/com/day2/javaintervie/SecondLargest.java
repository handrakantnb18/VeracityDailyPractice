package com.day2.javaintervie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.management.RuntimeErrorException;

public class SecondLargest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				10,2,45,98,35,78,16,89,34);
		
		int secondHeight = 
				list.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("List does not have enough elements "));
		
		System.out.println("Second Largest : "+secondHeight);
		
		
	}
}
