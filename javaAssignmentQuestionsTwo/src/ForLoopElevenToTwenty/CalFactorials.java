package ForLoopElevenToTwenty;

import java.util.Scanner;

public class CalFactorials {

	public static void main(String[] args) {
		
		// 17. Calculate factorial of a number using for loop.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		long factorial = 1;
		
		for (int i = 1; i <= num; i++)
		{
			factorial = factorial * i;
		}
		System.out.println("Factorials of "+ num + " is: "+factorial);
	}
}
