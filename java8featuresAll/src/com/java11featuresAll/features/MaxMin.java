package com.java11featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class MaxMin {

	public static void main(String[] args) {
	
		 List<Integer> list =
		            Arrays.asList(5,10,20,40,7);

		        int max =
		            list.stream()
		                .max(Integer::compare)
		                .get();

		        int min =
		            list.stream()
		                .min(Integer::compare)
		                .get();

		        System.out.println("Max: " + max);
		        System.out.println("Min: " + min);
	}
}
