package com.day3.java8featuresAll.features;

public class FindMissingNumber {

	// Find the missing number in an array from 1 to n.
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,5};

		int n = 5;

		int expectedSum = n * (n + 1) / 2;

		int actualSum = 0;

		for(int num : arr){
		    actualSum += num;
		}

		System.out.println(expectedSum - actualSum);
	}
}
