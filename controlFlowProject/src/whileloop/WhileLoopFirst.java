package whileloop;

import java.util.Scanner;

public class WhileLoopFirst {

	public static void main(String[] args) {
		
		// while loop used for the reuse the condition
//		int i = 1;
//		
//		while(i <= 10) {
//			System.out.println("Ram");
//			i++;
//		}
		
		// Multiplication of the enter any number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		
		int num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Invalid number..");
		}
		else {
			int i = 1;
			while (i <= 10) {
				System.out.println(num * i);
				i++;
			}
		}
		
		// 
		
	}
}
