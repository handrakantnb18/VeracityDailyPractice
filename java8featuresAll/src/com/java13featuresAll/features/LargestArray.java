package com.java13featuresAll.features;

public class LargestArray {

	public static void main(String[] args) {
		
		int arr[]={10,20,5,60,40};

        int max=arr[0];

        for(int i:arr){

            if(i>max)
                max=i;
        }

        System.out.println(max);
        
	}
}
