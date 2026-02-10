package loopingStatements;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		// check the factorial number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		
		int num = sc.nextInt();
		
		int fact = 1;
		
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		
		System.out.println(fact);
	}
}
