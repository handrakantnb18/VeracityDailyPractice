package com.corejava.xjavaandjava8coding;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int arr[] = {10,15,53,23,56,78};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MAX_VALUE;
		
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
			else if(num > second && num != first)
			{
				first = second;
			}
		}
		
		System.out.println(second);
		
		System.out.println(first);
		
		
		
		
	}
}
