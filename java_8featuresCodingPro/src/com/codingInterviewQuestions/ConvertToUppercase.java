package com.codingInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ConvertToUppercase {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("my self chandraaknt bhosale, from pune.");
		
		list.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
	}
}
