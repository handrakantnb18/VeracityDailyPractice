package com.java15featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(
				50,10,40,20,30,80,90);

        list.stream()
                .sorted()
                .forEach(System.out::println);
	}
}
