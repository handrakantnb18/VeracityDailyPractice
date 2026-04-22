package com.Day3.practice.java8;

import java.util.Arrays;
import java.util.List;

public class FindMax {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,88,55,25,45,65,100, 250);
		
		int max = list.stream().max(Integer::compare).get();
		
		System.out.println(max);
		
		
		List<Integer> list2 = Arrays.asList(23,56,45,78,88,98,235,200);
		
		int max1 = list2.stream().max(Integer::compare).get();
		
		System.out.println(max1);
		
		
		
	}
}
