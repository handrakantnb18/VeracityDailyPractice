package com.chatgpt.practiceTwenty;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// Check if a Number is Armstrong
		
		int num = 153, sum = 0, original = num;
		
		while (num != 0)
		{
			int digit = num % 10;
			sum += digit * digit * digit;
			num /= 10;
			
		}
		
		System.out.println(sum == original ? "Armstronng Number" : "Not Armstrong Number");
		
	}
}
