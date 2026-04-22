package com.Day3.practice.java8;

import java.util.Arrays;
import java.util.List;

public class FindMin {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(25,1,2,88,78,99,56,24);
		
		int min = list.stream().min(Integer::compare).get();
		
		System.out.println(min);
		
		System.out.println("===================================");
		
		List<Integer> list1 = Arrays.asList(25,36,45,98,78,55,59);
		
		int min1 = list1.stream().min(Integer::compare).get();
		
		System.out.println(min1);
		
		
		
	}
}
