package com.day4.java8featuresAll.features;

public class FindLargeNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 25, 30, 5, 40};

		int max = arr[0];

		for (int num : arr) {
		    if (num > max)
		        max = num;
		}

		System.out.println(max);
	}
}
