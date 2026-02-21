package DoWhileLoopTwentyOneToThirty;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// 28. Check whether a number is prime using while loop.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int a = sc.nextInt();
		
		int i = 2;
		boolean isPrime = true;
		
		
		if (a <= 1)
		{
			isPrime = false;
		}else
		{
			while(i <= a / 2)
				{
					if(a % i == 0)
					{
						isPrime = false;
						break;
					}
					i++;
				}
		}
		
		if(isPrime)
		{
			System.out.println("Number is prime");
		}else
		{
			System.out.println("Number is not prime.");
		}
	}
}
