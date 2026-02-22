package NestedLoopFourtyOneToFifty;

import java.util.Scanner;

public class PrintReverseNumber {

	public static void main(String[] args) {
		
		// 45. Print reverse number pattern using nested loops.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int n = sc.nextInt();
		
		for (int i = n; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
