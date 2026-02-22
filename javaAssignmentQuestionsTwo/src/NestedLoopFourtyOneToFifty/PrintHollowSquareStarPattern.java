package NestedLoopFourtyOneToFifty;

import java.util.Scanner;

public class PrintHollowSquareStarPattern {

	public static void main(String[] args) {

		// 49. Print hollow square star pattern using nested loops.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n; j++) {

				if (i == 1 || i == n || j == 1 || j == n) 
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
