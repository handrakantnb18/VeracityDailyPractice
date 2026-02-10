package IFElseStatement;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 
		System.out.println("Enter userName : ");
		
		String userName = sc.next();
		
		System.out.println("Enter password : ");
		
		String password = sc.next();
		
		if (userName.equals("chandrakant") && password.equals("12345")) {
			System.out.println("Login success.");
		}
		else {
			System.out.println("Faild to login");
		}
		
	}

}
