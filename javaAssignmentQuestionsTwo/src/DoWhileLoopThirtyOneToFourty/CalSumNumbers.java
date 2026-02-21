package DoWhileLoopThirtyOneToFourty;

import java.util.Scanner;

public class CalSumNumbers {
	public static void main(String[] args) {

		// 34. Calculate sum of numbers from 1 to 50 using do-while loop.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int a = 1;
		int b = 0;
		
		do
		{
			b = b + a;
			a++;
		}while(a <= 20);
		System.out.println("Sum : "+b);
		
		// simple way

//		int i = 1;
//		int num = 0;
//		
//		do
//		{
//			num = num + i;
//			i++;
//		}while(i <= 50);
//		System.out.println("Sum : "+num);
	}

}
