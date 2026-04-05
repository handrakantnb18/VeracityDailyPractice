package com.codingInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class CCountStringStart {
	
	public static void main(String[] args) {
		
		List<String> ch = Arrays.asList("as you wish a Charactor");
		
		long count = ch.stream()
				.filter(s -> s.startsWith("a"))
				.count();
		
		System.out.println(count);
		
	}

}
