package com.Day5.streamAPI;

import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,25,45,78,35,12);
		
		System.out.println("Even Numbers : ");
		list.stream()
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
		
		System.out.println("");
		System.out.println("Odd Numbers : ");
		list.stream()
		.filter(n -> n % 2 != 0)
		.forEach(System.out::println);
		
		List<Integer> list1 = Arrays.asList(25,88,55,65,56,23,15,12);
		
		System.out.println("");
		System.out.println("Even Numbers : ");
		list1.stream()
		.filter(m -> m % 2 == 0)
		.forEach(System.out::println);
		
		System.out.println(" ");
		System.out.println("Odd Numbers : ");
		list1.stream()
		.filter(m -> m % 2 != 0)
		.forEach(System.out::println);
		
		
	}

}
