package NestedLoopFourtyOneToFifty;

import java.util.Scanner;

public class PrintFloydTringle {

	public static void main(String[] args) {
		
		// 48. Print Floyd’s triangle using nested loops.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int n = sc.nextInt();
		
		int num = 1;
		
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
