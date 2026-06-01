package com.day3.zzjava8Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMazimumNumber {

	public static void main(String[] args) {
		
		List<Integer> num1 = new ArrayList<Integer>();
		num1.add(100);
		num1.add(200);
		num1.add(300);
		num1.add(400);
		num1.add(500);
		
		int max = Collections.max(num1);
		
		System.out.println("Maximum No : "+max);
		
		List<Integer> num2 = Arrays.asList(10,25,35,45,
				95,85,65,75,33,55,88,66,99);
		
		int max1 = Collections.max(num2);
		
		System.out.println("Max No : "+max1);
		
		
	}
}
