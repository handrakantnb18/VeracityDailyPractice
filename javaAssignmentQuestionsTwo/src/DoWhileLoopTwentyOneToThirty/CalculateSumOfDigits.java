package DoWhileLoopTwentyOneToThirty;

import java.util.Scanner;

public class CalculateSumOfDigits {

	public static void main(String[] args) {
		
		// 24. Calculate sum of digits of a number using while loop.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		
		int num = sc.nextInt();
		
		int sum = 0;
		
		if(num < 0)
		{
			num = -num;
		}
		
		while(num != 0)
		{
			int digit = num % 10;
			sum = sum + digit;
			num = num /10;
		}
		
		System.out.println("Sum : "+sum);
		
	}
}
