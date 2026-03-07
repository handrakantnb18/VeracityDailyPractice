package com.twentyImpQuestions;

public class FindLargestNumber {

	public static void main(String[] args) {
		int arr[] = {100, 10, 200, 25, 8, 40, 15, 88, 26 };
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println("Largest number : "+max);
	}
}
