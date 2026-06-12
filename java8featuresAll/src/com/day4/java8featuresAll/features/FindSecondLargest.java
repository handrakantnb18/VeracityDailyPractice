package com.day4.java8featuresAll.features;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 50, 30, 40};

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
		    if (num > largest) {
		        secondLargest = largest;
		        largest = num;
		    } else if (num > secondLargest && num != largest) {
		        secondLargest = num;
		    }
		}

		System.out.println(secondLargest);
		
	}
}
