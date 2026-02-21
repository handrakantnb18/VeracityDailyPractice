package DoWhileLoopTwentyOneToThirty;

import java.util.Scanner;

public class FindProduct {

	public static void main(String[] args) {
		// 30. Find product of digits of a number using while loop.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int a = sc.nextInt();
		
		int product = 1;
		
		if(a == 0)
		{
			product = 0;
		}else
		{
			while(a > 0) {
				int digit = a % 10;
				product = product * digit;
				a = a / 10;
			}
		}
		System.out.println("Products : "+product);
	}
}
