package com.twentyImpQuestions;

public class FindSmallestNumber {

	public static void main(String[] args) {
		int arr[] = {25, 28, 89, 15, 79, 800, 100, 20};
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Smallest Number : "+min);
	}
}
