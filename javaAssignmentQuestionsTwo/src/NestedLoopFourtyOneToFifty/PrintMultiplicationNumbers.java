package NestedLoopFourtyOneToFifty;

import java.util.Scanner;

public class PrintMultiplicationNumbers {

	public static void main(String[] args) {
		
		// 46. Print multiplication tables from 1 to 5 using nested loops.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		for (int i = 1; i <= 5; i++)
		{
			System.out.println(i);
			for (int j = 1; j <= 10; j++)
			{
				System.out.println(i +" X "+j+" = "+(i * j));
			}
		}
	}
}
