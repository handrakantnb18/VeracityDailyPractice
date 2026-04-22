package com.Day3.practice.java8;

import java.util.Arrays;
import java.util.List;

public class FindMax {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,88,55,25,45,65,100, 250);
		
		int max = list.stream().max(Integer::compare).get();
		
		System.out.println(max);
		
		System.out.println("===============================");
		
		List<Integer> list2 = Arrays.asList(23,56,45,78,88,98,235,200);
		
		int max1 = list2.stream().max(Integer::compare).get();
		
		System.out.println(max1);
		
		System.out.println("=================================");
		
		List<Integer> list3 = Arrays.asList(78,98,55,25,45,65,23,11);
		
		int max3 = list3.stream().max(Integer::compare).get();
		
		System.out.println(max3);
		
	}
}
