package com.corejav.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		// Remove Duplicate Elements from ArrayList
		
		List<Integer> list = Arrays.asList(1,2,5,8,9,2,3,4,5,6,7,8,9,100);
		
		Set<Integer> set = new LinkedHashSet<Integer>(list);
		
		System.out.println(set);
		
	}
}
