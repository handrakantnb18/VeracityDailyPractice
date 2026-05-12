package com.corejav.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(56,23,85,12,45,65,32,82,29);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
	}
}
