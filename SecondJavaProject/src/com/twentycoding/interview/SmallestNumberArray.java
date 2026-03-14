package com.twentycoding.interview;

public class SmallestNumberArray {

	public static void main(String[] args) {

		int arr[] = { 10, 25, 8, 40, 15 };
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Smallest Number: " + min);
	
	}
}
