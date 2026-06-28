package com.java13featuresAll.features;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateJava8 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,2,5,3);

        Set<Integer> set=new HashSet<>();

        list.stream()
                .filter(n->!set.add(n))
                .forEach(System.out::println);
	}
}
