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
		
		System.out.println("=====================================");

		List<Integer> list1 = Arrays.asList(
				10,11,12,13,14,15,16,17,18,19,15,12,14,16);
		
		Set<Integer> uniqueElemnts1 = new HashSet<Integer>();
		
		Set<Integer> duplicates1 =
				list1.stream()
				.collect(Collectors.toSet());
		
		System.out.println("Duplicate Elements : "+duplicates1);
		
		System.out.println("=====================================");
		
		List<Integer> list2 = Arrays.asList(
				10,2,20,3,5,8,6,6,8,7,9,15,15,18,4,19,18);
		
		Set<Integer> uniqIntegers2 = new HashSet<Integer>();
		
		Set<Integer> duplicates2 =
				list2.stream()
				.collect(Collectors.toSet());
		
		System.out.println("Duplicate Elements : "+duplicates2);
		
		
		
		
	}
}
