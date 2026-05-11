package com.j8features.java8coding;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		// Find Largest Number in Array
		
		int arr[] = {10,55,50,60,70,20,90,99,77};
		
		int max = arr[0];
		
		for(int i =1; i<arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
	}
}
