package com.codingInterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	void add()
	{
		System.out.println("Instance method reference.");
	}
	
	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("My name is chandrakant bhosale");
		//str.add(System.out::println);
		str.forEach(System.out::println);
		//str.add("please check the method");
		
	}
}
