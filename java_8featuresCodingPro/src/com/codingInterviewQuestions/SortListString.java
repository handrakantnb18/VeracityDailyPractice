package com.codingInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class SortListString {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Amar","Chandraaknt","Priyanka","Vijay","Abhi","Ram");
		
		list.sort((a,b)-> a.compareTo(b));
		
		list.forEach(System.out::println);
		
	}
}
