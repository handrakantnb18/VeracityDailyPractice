package com.codingInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ConvertToLowercase {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("MY NAME IS CHANDRAAKNT BHOSALE, I FROM PUNE");
		
		list.stream()
		.map(String::toLowerCase)
		.forEach(System.out::println);
		
	}
}
