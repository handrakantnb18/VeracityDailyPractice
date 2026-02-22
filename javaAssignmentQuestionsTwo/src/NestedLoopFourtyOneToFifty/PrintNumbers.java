package NestedLoopFourtyOneToFifty;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		
		// 44. Print number pattern:
	    //  1
	    // 12
	    // 123
	    // 1234
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
