package com.java14featuresAll.features;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		int arr[] = {25,65,89,75,15,35,65,19};
		
		int max = arr[0];
		
		for(int i:arr)
		{
			if(i>max)
				max=i;
		}
		
		System.out.println(max);
		
	}
}
