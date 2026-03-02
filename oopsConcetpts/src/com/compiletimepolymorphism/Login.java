package com.compiletimepolymorphism;

import java.util.Scanner;

public class Login {

	// create simple login different ways
	
	void login(long mobilenumber)
	{
		// otp generate
		int otp = (int)(Math.random() * 10000);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter otp : "+otp);
		int userOtp = sc.nextInt();
		
		if (userOtp == otp)
		{
			System.out.println("Login success.");
		}
		else
		{
			System.out.println("Login fail");
		}
	}
	
	void login(String username, String password)
	{
		if(username.equals("chandra") && password.equals("1818"))
		{
			System.out.println("Login success.");
		}
		else
		{
			System.out.println("Login failed");
		}
	}
	
	void login(String gmail)
	{
		if(gmail.contains("@"))
		{
			System.out.println("Login success");
		}
		else
		{
			System.out.println("Login failed");
		}
	}
	
	public static void main(String[] args) {
		Login l1 = new Login();
		l1.login(987654321L);
		l1.login("chandra", "1818");
		l1.login("chandra@gmail.com");
	}
}
