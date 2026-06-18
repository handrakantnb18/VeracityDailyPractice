package com.java9featuresAll.features;

public class FindLargestElement {

	public static void main(String[] args) {
		
		int[] arr = {5, 88, 65, 8, 2, 15, 9, 99, 500, 700};

		int max = arr[0];

		for(int num : arr) {
		    if(num > max)
		        max = num;
		}

		System.out.println(max);
	}
}
