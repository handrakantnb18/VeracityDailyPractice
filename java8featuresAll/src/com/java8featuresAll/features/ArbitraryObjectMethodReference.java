package com.java8featuresAll.features;

import java.util.Arrays;
import java.util.List;

public class ArbitraryObjectMethodReference {
	public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(System.out::println);
    }
}
