package com.codingInterviewQuestions;

import java.util.Optional;

public class NullPointerException {

	public static void main(String[] args) {
		
		Optional<String> str = Optional.ofNullable(null);
		
		System.out.println(str.orElse("Chandraaknt Bhosale"));
		
	}
}
