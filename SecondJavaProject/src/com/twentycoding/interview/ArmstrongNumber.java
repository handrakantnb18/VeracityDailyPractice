package com.twentycoding.interview;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 153;
		int sum = 0;
		int temp = num;

        while(num != 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if(sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
	}
}
