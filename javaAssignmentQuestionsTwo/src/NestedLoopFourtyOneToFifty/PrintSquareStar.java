package NestedLoopFourtyOneToFifty;

import java.util.Scanner;

public class PrintSquareStar {

	public static void main(String[] args) {
		
		// 41. Print square star pattern using nested loops.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			for (int j = 1; j <= num; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// simple Square pattern in nested loop
		
//		for (int i = 1; i <= 5; i++)
//		{
//			for (int j = 1; j <= 5; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}
