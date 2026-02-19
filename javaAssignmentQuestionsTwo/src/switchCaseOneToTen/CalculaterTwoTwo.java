package switchCaseOneToTen;

import java.util.Scanner;

public class CalculaterTwoTwo {

	public static void main(String[] args) {

		// Create a calculator using switch case for +, -, *, / operations.

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number : ");
		double a = sc.nextDouble();

		System.out.println("Enter Second Number : ");
		double b = sc.nextDouble();

		System.out.println("Enter Operator : ");
		char operator = sc.next().charAt(0);

		double cal;

		switch (operator) {

		case '+':
			cal = a + b;
			System.out.println("Addition Number is : " + cal);
			break;

		case '-':
			cal = a - b;
			System.out.println("Substraction is : " + cal);
			break;

		case '*':
			cal = a * b;
			System.out.println("Multiplication is : " + cal);
			break;

		case '/':
			cal = a / b;
			System.out.println("Division is : " + cal);
			break;

		default:
			System.err.print("Enter correct Operators..");
			break;
		}
	}
}
