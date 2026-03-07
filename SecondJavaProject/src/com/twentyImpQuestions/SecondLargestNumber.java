package com.twentyImpQuestions;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int arr[] = {10, 20, 55, 30, 88, 66, 73};
		int first = 0; 
		int second = 0;
		
		for(int num : arr)
		{
			if(num > first)
			{
				second = first;
				first = num;
			}
			else if(num > second)
			{
				second = num;
			}
		}
		System.out.println("Second Largest Number : "+second);
	}
}
