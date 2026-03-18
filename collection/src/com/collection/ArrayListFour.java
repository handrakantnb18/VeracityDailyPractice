package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListFour {

	public static void main(String[] args) {
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		
//		List<Integer> number = new ArrayList<Integer>();
		
//		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
//		
//		System.out.println(num);
		
		List<Student> nums = Arrays.asList(new Student(1, "Chandrakant", "Pune"), new Student(2, "Priyanka", "Sangli"));
		
		
		System.out.println(nums);
		
	}
}
