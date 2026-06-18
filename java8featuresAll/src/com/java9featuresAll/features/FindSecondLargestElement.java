package com.java9featuresAll.features;

public class FindSecondLargestElement {

	public static void main(String[] args) {
		
		int[] arr = {10, 5, 20, 15, 8};

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for(int num : arr) {
		    if(num > first) {
		        second = first;
		        first = num;
		    } else if(num > second && num != first) {
		        second = num;
		    }
		}

		System.out.println(second);
	}
}
