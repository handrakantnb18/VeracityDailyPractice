package com.day4.aadisirjavaQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrays {

	public static void main(String[] args) {
		
		// 5) Reverse ArrayList
		// Write a program to reverse elements of an ArrayList
		
		List<Integer> list = Arrays.asList( 1,2,3,4,5,
				6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
				);
		
		System.out.println("Numbers : "+list);
		
		Collections.reverse(list);
		
		System.out.println("Reverse Array : "+list);
		
		// 2
		
		Collections.reverse(list);
		
		for(int i = list.size() - 1; i >=0; i--)
		{
			System.out.print(list.get(i));
		}
		
		
	}
}
