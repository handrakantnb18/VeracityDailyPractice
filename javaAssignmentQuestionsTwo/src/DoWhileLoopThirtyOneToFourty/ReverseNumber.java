package DoWhileLoopThirtyOneToFourty;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		// 36. Reverse a number using do-while loop.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		int reverse = 0;
		int x;
		
		do
		{
			x = num % 10;
			reverse = reverse * 10 + x;
			num = num / 10;
			
			
		}while(num != 0);
		System.out.println("Reverse number : "+reverse);
	}
}
