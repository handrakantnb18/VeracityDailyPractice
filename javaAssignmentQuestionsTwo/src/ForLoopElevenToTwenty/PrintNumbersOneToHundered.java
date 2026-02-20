package ForLoopElevenToTwenty;

import java.util.Scanner;

public class PrintNumbersOneToHundered {

	public static void main(String[] args) {
		// 11. Print numbers from 1 to 100 using for loop.
		
		// Scanner sc = new Scanner(System.in);
		// System.out.println("1 to 100 numbers");
		
		// int num = sc.nextInt();
		
		for (int i = 1; i <= 100; i++)
		{
			System.out.print(" "+i+ " |");
			if(i % 10 == 0)
			{
				System.out.println( " ");
			}
			
		}
		
	}
}
