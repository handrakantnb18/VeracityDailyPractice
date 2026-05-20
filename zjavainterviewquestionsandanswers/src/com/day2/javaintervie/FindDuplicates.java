package com.day2.javaintervie;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				1,2,3,4,5,6,7,8,9,9,5,1,2,10);
		
		Set<Integer> uniqueElements = new HashSet<Integer>();
		
		Set<Integer> duplicates =
				list.stream()
				.collect(Collectors.toSet());
		
		System.out.println("Duplicate Elements : "+duplicates);
		
		
	}
}
