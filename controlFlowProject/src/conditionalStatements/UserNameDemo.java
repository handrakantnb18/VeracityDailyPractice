package conditionalStatements;

import java.util.Scanner;

public class UserNameDemo {
	public static void main(String[] args) {
		
		// print valid and invalid userName and password check
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter UserName  :");
		
		String userName =  sc.next();
		
		if (userName.length() < 5) {
			System.err.println("Invalied UserName. UserName should be 5 charactor");
			return; // end excution
		}
		if (userName.length() >= 5) {
			System.out.println("Valid Username : "+userName);
			
			
		}
		
		// print valid and invalid userName lenght and password length check
		
		System.out.println("Enter password : ");
		String password = sc.next();
		
		if (password.length() < 5) {
			System.err.println("Invalid password. please Re-enter password.");
		}
		
		if (password.length() > 5) {
			System.out.println("Valid password : "+password);
			
		}
		
		//check the password = 12345 and username = chandrakant
		
		if (userName.equals("chandrakant") && password.equals("12345")) {
			System.out.println("Login Successful..");
		}
		
		if (!userName.equals("chandrakant") || !password.equals("12345")) {
			System.out.println("Login failed..");
		}
		
	}
	
}
