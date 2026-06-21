package com.java11featuresAll.features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		List<Integer> list =
                Arrays.asList(1,2,3,4,2,5,6,3,7);

        Set<Integer> set = new HashSet<>();

        list.stream()
            .filter(n -> !set.add(n))
            .forEach(System.out::println);
	}
}
