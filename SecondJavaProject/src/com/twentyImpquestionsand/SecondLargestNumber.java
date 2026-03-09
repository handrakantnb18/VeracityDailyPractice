package com.twentyImpquestionsand;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int arr[] = { 10, 25, 56, 89, 100, 45, 88};
		int first = 0;
		int second = 0;
		
		for(int num : arr)
		{
			if(num > first)
			{
				second = first;
				first = num;
			}
			else if (num > second)
			{
				second = num;
			}
		}
		
		System.out.println("Second Largest : "+second);
	}
}
