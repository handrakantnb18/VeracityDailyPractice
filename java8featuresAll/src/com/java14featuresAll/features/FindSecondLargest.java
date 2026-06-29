package com.java14featuresAll.features;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int arr[] = {45,89,65,32,78,15,95,35,45,22};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int num:arr)
		{
			if(num > first)
			{
				second = first;
				first= num;
			}
			else if(num> second && num != first)
			{
				second = num;
			}
		}
		
		System.out.println(second);
	}
}