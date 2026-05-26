package com.day4.aadisirjavaQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetDisplay {

	public static void main(String[] args) {
		
		// 13) LinkedHashSet Example
		// Create a LinkedHashSet and display insertion order.

		LinkedHashSet<Integer> list = new LinkedHashSet<Integer>(
				Arrays.asList(
						15,25,35,45,55,56,75,85,95,55,5,6,9,7
						));
		
		System.out.println(list);
		
		// 13) LinkedHashSet Example
		// Create a LinkedHashSet and display insertion order.

		LinkedHashSet<String> list1 = new LinkedHashSet<String>();
		
		list1.add("Chandrakant");
		list1.add("Priyanka");
		list1.add("Shivraj");
		list1.add("Swaraj");
		
		System.out.println(list1);
		
		
		System.out.println();
		
	}
}
