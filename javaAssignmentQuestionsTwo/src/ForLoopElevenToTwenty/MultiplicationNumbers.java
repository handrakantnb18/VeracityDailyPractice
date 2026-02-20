package ForLoopElevenToTwenty;

import java.util.Scanner;

public class MultiplicationNumbers {

	public static void main(String[] args) {
		// 15. Print multiplication table of a given number using for loop.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int num = sc.nextInt();
		
		for (int i = 1; i<=10; i++)
		{
			System.out.println(num + " X "+ i +" = "+(num * i));
			
		}
	}
}
