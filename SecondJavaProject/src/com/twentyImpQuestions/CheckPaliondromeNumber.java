package com.twentyImpQuestions;

public class CheckPaliondromeNumber {

	public static void main(String[] args) {
		int num = 121;
		int rev = 0;
		
		int temp = num;
		
		while(num != 0)
		{
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		
		if(temp == rev)
			System.out.println("Paliondrome number ..");
		else
			System.out.println("Not paliondrome number...");
	}
}
