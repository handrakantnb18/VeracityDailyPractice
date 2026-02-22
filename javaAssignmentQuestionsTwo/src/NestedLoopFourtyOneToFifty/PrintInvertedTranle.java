package NestedLoopFourtyOneToFifty;

import java.util.Scanner;

public class PrintInvertedTranle {

	public static void main(String[] args) {
		
		// 43. Print inverted triangle star pattern using nested loops.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int n = sc.nextInt();
		
		for (int i = n; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
