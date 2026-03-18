package com.java.eightprogram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		 int num = 153;
		 int sum = 0;
		 int original = num;
		 
		 while(num != 0)
		 {
			 int digit = num % 10;
			 sum += digit * digit * digit;
			 num /= 10;
		 }
		 
		 System.out.println(sum == original ? "Armstrong" : "Not Armstrong");
		 
	}
}
