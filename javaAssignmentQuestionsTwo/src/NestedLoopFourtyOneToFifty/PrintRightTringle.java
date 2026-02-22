package NestedLoopFourtyOneToFifty;

import java.util.Scanner;

public class PrintRightTringle {

	public static void main(String[] args) {
		
		// 42. Print right angle triangle star pattern using nested loops.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
