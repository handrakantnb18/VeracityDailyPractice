package com.corejav.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(88,55,22,33,66,44,77,99,11,22,33);
		
		int min = Collections.min(list);
		
		System.out.println(min);
		
	}
}
