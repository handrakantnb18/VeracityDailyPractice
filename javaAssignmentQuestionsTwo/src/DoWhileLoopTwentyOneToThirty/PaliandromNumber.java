package DoWhileLoopTwentyOneToThirty;

import java.util.Scanner;

public class PaliandromNumber {

	public static void main(String[] args) {
		
		// 26. Check whether a number is palindrome using while loop.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		int originalNum = num;
		int reverse = 0;
		
		while(num != 0)
		{
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}
		
		if (originalNum == reverse)
		{
			System.out.println("This number is paliandrom.");
		}
		else
		{
			System.out.println("This is not paliondrom Number.");
		}
	}
}
