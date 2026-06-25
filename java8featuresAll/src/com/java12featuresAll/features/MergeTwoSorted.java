package com.java12featuresAll.features;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoSorted {

	public static void main(String[] args) {
		
		int[] a = {1,3,5};
		int[] b = {2,4,6};

		int[] result = IntStream
		        .concat(Arrays.stream(a),
		                Arrays.stream(b))
		        .sorted()
		        .toArray();

		System.out.println(Arrays.toString(result));
	}
}
