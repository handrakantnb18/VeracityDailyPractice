package DoWhileLoopThirtyOneToFourty;

import java.util.Scanner;

public class PrintMultiplication {

	public static void main(String[] args) {
		
		// 35. Print multiplication table using do-while loop.

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int a = 9;
		int b = 1;
		
		do
		{
			System.out.println("Multiplication of "+a+" X "+b+" = "+(a * b));
			b++;
		}while(b <= 10);
		
		// simple way to print numbers
		
//		int num = 5;
//		int i = 1;
//		
//		do
//		{
//			System.out.println("Sum of "+num+" X "+i+" of : "+(num * i));
//			i++;
//		}while(i <= 10);
	}
}
