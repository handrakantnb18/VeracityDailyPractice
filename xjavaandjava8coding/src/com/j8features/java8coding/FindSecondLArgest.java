package com.j8features.java8coding;

public class FindSecondLArgest {

	public static void main(String[] args) {
		
		// Find Second Largest Number
		
		int arr[] = {10,22,25,45,78,98,65,35,21,45,85,66,55,99};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int num : arr)
		{
			if(num > first)
			{
				second = first;
				first = num;
			}
			else if(num > second && num != first)
			{
				second = num;
			}
		}
		
		System.out.println(second);
		
	}
}
