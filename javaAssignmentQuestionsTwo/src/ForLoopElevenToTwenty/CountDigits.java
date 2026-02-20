package ForLoopElevenToTwenty;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		
		// 20. Count digits of a number using for loop.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		int count = 0;
		
		if (num < 0)
		{
			num = -num;
		}
		
		for (; num != 0; num = num / 10)
		{
			count++;
		}
		
		if (count == 0)
		{
			count = 1;
		}
		System.out.println("Total Digits : "+count);
	}
}
