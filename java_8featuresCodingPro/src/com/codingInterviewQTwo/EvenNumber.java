package com.codingInterviewQTwo;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,25,35,40,50,60,55,65);
		
		list.stream()
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
		
		
		
	}
}
