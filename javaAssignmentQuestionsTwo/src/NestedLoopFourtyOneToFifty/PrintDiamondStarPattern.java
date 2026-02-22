package NestedLoopFourtyOneToFifty;

import java.util.Scanner;

public class PrintDiamondStarPattern {

	public static void main(String[] args) {
		
		// 50. Print diamond star pattern using nested loops.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int a = sc.nextInt();
		
//		for (int i =1; i <= a; i++)
//		{
//			
//			for (int j = 1; j <= a - i; j++)
//			{
//				
//				for (int k = 1; k <= (2 * i - 1); k++)
//				{
//					System.out.print("* ");
//				}
//				
//				System.out.println();
//			}
			
			for (int i = a - 1; i >= 1; i--)
			{
				
				for (int j = 1; j <= a - i; j++)
				{
					System.out.print(" ");
				}
				
				for (int k = 1; k <= (2 * i - 1); k++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
	//	}
	}
}
