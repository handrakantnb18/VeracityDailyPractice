package com.corejav.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,15,25,35,45,55,65,75,85,95);
		
		int max = Collections.max(list);
		
		System.out.println(max);
		
	}
}
