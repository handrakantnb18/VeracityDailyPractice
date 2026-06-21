package com.java11featuresAll.features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseSort {

	public static void main(String[] args) {
		
		 List<Integer> list =
		            Arrays.asList(5,2,9,1,3);

		        list.stream()
		            .sorted(Comparator.reverseOrder())
		            .forEach(System.out::println);
	}
}
