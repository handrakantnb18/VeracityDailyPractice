package com.corejav.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateEle {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,1,2,3,5);
		
		Set<Integer> set = new HashSet<Integer>();
		
		list.stream()
		.filter(n -> !set.add(n))
		.forEach(System.out::println);
		
	}
}
