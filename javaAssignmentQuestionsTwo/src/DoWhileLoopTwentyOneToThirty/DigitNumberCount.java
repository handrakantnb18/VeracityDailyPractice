package DoWhileLoopTwentyOneToThirty;

import java.util.Scanner;

public class DigitNumberCount {

	public static void main(String[] args) {
		
		// 27. Count number of digits in a number using while loop.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		int count = 0;
		
		if (num == 0)
		{
			count = 1;
		}else {
			while(num > 0)
			{
				num = num / 10;
				count++;
			}
		}
		System.out.println("Total Digits : "+count);
		
	}
}
