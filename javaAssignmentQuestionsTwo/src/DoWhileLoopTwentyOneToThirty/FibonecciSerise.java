package DoWhileLoopTwentyOneToThirty;

import java.util.Scanner;

public class FibonecciSerise {

	public static void main(String[] args) {
		
		// 29. Print Fibonacci series up to N terms using while loop.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int a = sc.nextInt();
		
		int first = 0, second = 1;
		int count = 1;
		
		while(count <= a)
		{
			System.out.println(first + " ");
			
			int next = first + second;
			first = second;
			second = next;
			
			count++;
		}
	}
}
