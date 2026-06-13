package com.day3.java8featuresAll.features;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElements {

	// Find Duplicate Elements in Array
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2,4,5,4};

		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();

		for(int num : arr){
		    if(!unique.add(num)){
		        duplicates.add(num);
		    }
		}

		System.out.println(duplicates);
	}
}
