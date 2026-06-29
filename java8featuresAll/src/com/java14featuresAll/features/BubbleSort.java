package com.java14featuresAll.features;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[]={5,2,8,1,10,88,25,78,35};

		for(int i=0;i<arr.length;i++){

		    for(int j=0;j<arr.length-i-1;j++){

		        if(arr[j]>arr[j+1]){

		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}

		System.out.println(Arrays.toString(arr));
	}
}
