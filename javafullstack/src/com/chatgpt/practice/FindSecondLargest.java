package com.chatgpt.practice;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Find Second Largest Element in Array
		
		int[] arr = {100, 20, 4, 45, 99 };
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for (int i = 1; i < arr.length; i++)
		{
			if(arr[i] > largest)
			{
				secondLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] > secondLargest && arr[i] != largest)
			{
				secondLargest = arr[i];
			}
		}
		
		System.out.println("Second Largest : "+secondLargest);
	}
}
