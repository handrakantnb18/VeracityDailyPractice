package DoWhileLoopThirtyOneToFourty;

import java.util.Scanner;

public class FibonecciSerise {

	public static void main(String[] args) {
		
		// 40. Print Fibonacci series using do-while loop.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		int first= 0, second = 1;
		int count = 1;
		
		System.out.println("Fibonneci Series : ");
		if(num >= 1)
		{
			do
			{
				System.out.print(first + " |");
				
				int next = first + second;
				first = second;
				second = next;
				
				count++;
				
				
			}while(count <= num);
		}
	}
}
