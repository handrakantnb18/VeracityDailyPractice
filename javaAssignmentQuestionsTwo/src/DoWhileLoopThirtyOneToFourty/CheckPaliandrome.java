package DoWhileLoopThirtyOneToFourty;

import java.util.Scanner;

public class CheckPaliandrome {

	public static void main(String[] args) {
		
		// 37. Check palindrome number using do-while loop.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		
		int num = sc.nextInt();
		
		int a = num;
		int i = 0;
		int r;
		
		do
		{
			r = num % 10;
			i = i * 10 + r;
			num = num /10;
			
		}while(num !=0);
		
		if(a == i)
		{
			System.out.println("Paliandrom number");
		}else
		{
			System.out.println("Not paliandrom number");
		}
	}
}
