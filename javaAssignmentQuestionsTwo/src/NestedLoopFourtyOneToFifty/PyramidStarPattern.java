package NestedLoopFourtyOneToFifty;

import java.util.Scanner;

public class PyramidStarPattern {

	public static void main(String[] args) {
		
		// 47. Print pyramid star pattern using nested loops.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int n = sc.nextInt();
		
		for (int i = 1; i<= n; i++)
		{
			for (int j = 1; j <= n - 1; j++)
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <= (2 * i - 1); k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		
	}
}
