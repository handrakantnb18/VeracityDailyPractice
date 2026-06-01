package com.day3.zzjava8Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaximumNumber {

	public static void main(String[] args) {
		
		List<Integer> num1 = new ArrayList<Integer>();
		num1.add(80);
		num1.add(50);
		num1.add(70);
		num1.add(60);
		num1.add(40);
		num1.add(10);
		
		int max = num1.get(0);
		
		for(int num : num1)
		{
			if(num > max)
			{
				max = num;
			}
		}
		
		System.out.println("Maximum Number : "+max);
		
		int min = num1.get(0);
		
		for(int number : num1)
		{
			if(number < min)
			{
				min = number;
			}
		}
		
		System.out.println("Minimum Number : "+min);
		
		// 2
		
		List<Integer> list = Arrays.asList(10,25,
				45,85,66,99,88,37,85,92);
		
		int max11 = Collections.max(list);
		
		System.out.println("maximum Number : "+max11);
		
		int min11 = Collections.min(list);
		
		System.out.println("Minimum Number : "+min11);
		
		
	}
}
