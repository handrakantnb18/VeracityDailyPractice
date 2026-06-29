package com.java14featuresAll.features;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num=153;

		int sum=0,temp=num;

		while(temp!=0){

		    int rem=temp%10;

		    sum+=rem*rem*rem;

		    temp/=10;
		}

		System.out.println(sum==num);
		
	}
}
