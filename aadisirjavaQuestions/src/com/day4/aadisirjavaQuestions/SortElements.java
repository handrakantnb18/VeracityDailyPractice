package com.day4.aadisirjavaQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortElements {

	public static void main(String[] args) {
		
		// Sort ArrayList - Write a program to sort elements of an ArrayList in ascending order.

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(50);
		list.add(80);
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(70);
		list.add(20);
		
		Collections.sort(list);
		
		System.out.println("Sorted numbers" +list);
		
		List<Integer> list1 = Arrays.asList(
				500,90,78,65,23,15,78
				);
		
		Collections.sort(list1);
		
		System.out.println("Sorted numbers : "+list1);
		
		
	}
}
