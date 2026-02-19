package switchCaseOneToTen;

import java.util.Scanner;

public class CalculaterTwo {

	public static void main(String[] args) {
		// Create a calculator using switch case for +, -, *, / operations.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number One : ");
		double num1 = sc.nextDouble();

		System.out.println("Enter Number Two : ");
		double num2 = sc.nextDouble();

		System.out.println("Operator is : ");
		char operator = sc.next().charAt(0);
		

		double res;

		switch (operator) {

		case '+':
			res = num1 + num2;
			System.out.println("Addition is : " + res);
			break;

		case '-':
			res = num1 - num2;
			System.out.println("Substraction is : " + res);
			break;

		case '/':
			res = num1 / num2;
			System.out.println("Substraction is : " + res);
			break;

		case '*':
			res = num1 * num2;
			System.out.println("Multiplication is : " + res);

		default:
			System.out.println("Please Enter this Operators +, /, * ,-");
			break;
		}
	}
}
