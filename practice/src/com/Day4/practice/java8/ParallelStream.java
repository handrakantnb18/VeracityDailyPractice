package com.Day4.practice.java8;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Chandrakant","Bhosale");
		
		list.parallelStream()
		.forEach(System.out::println);
		
		
		List<Integer> list1 = Arrays.asList(1,5,8,89,56,35,45,78,22);
		
		list1.parallelStream()
		.forEach(System.out::print);
		
		
	}
}
