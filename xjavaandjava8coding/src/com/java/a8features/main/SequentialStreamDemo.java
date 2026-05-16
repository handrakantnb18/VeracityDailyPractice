package com.java.a8features.main;

import java.util.Arrays;
import java.util.List;

public class SequentialStreamDemo {

	public static void main(String[] args) {
		
		 List<String> names = Arrays.asList("A", "B", "C", "D");

	        names.stream()
	             .forEach(System.out::println);

	        System.out.println("----------");
	        
	        List<String> names1 = Arrays.asList("A", "B", "C", "D");

	        names1.stream()
	             .forEach(System.out::println);

	        
	}
}
