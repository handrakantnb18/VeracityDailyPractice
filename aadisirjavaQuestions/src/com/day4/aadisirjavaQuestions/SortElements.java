package com.day4.aadisirjavaQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortElements {

	public static void main(String[] args) {
		
		// Sort ArrayList - Write a program to sort elements of an ArrayList in ascending order.

		List<Integer> list = new ArrayList<Integer>();
		
		list.add(50);
		list.add(80);
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(70);
		list.add(20);
		
		Collections.sort(list);
		
		System.out.println("Sorted numbers" +list);
		
		// 2 
		
		List<Integer> list1 = Arrays.asList(
				500,90,78,65,23,15,78
				);
		
		Collections.sort(list1);
		
		System.out.println("Sorted numbers : "+list1);
		
		// 3
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(9);
		list2.add(1);
		list2.add(5);
		list2.add(7);
		
		Collections.sort(list2);
		
		System.out.println("Sorted Numbers : "+list2);
		
		// 4 
		
		List<Integer> alist = new ArrayList<Integer>();
		
		alist.add(99);
		alist.add(90);
		alist.add(80);
		alist.add(9);
		alist.add(55);
		alist.add(45);
		alist.add(12);
		
		Collections.sort(alist);
		
		System.out.println("Sorted List : "+alist);
		
		for(Integer num : alist)
		
		{
			boolean isPrime = true;
			
			if(num <= 1)
			{
				isPrime = false;
				
				System.out.println("prime numbers."+alist);
			}
			else
			{
				for(int i = 2; i <= num / 2; i++)
				{
				
					if(num % i == 0)
					{
						isPrime = false;
						System.out.println("Not prime numbers."+alist);
						break;
						
					}
				}
				
			}
		}


	}
}
