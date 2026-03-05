package com.interface5;

public class Demo implements Test1, Test2 {

	// common implementation
	
	public void login()
	{
		System.out.println("Login");
	}
	
	public static void main(String[] args) {
		
		Test1 t1 = new Demo();
		t1.login();
		
		Test2 t2 = new Demo();
		t2.login();
		
	}
}
