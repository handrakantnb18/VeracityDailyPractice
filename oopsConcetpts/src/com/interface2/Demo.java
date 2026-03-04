package com.interface2;

import com.A.Student;
import com.interface1.Test;

public class Demo implements Test {

	// different package and child class access
	
//	public static void main(String[] args) {
//		System.out.println(Test.id);
//	}
	
	// abstract method super class access to child class
	
	@Override
	public void login()
	{
		System.out.println("Login");
	}
	
	@Override
	public void register()
	{
		System.out.println("register");
	}
	
	public static void main(String[] args) {
//		Demo d = new Demo();
//		d.login();
//		d.register();
//		
//		System.out.println(Demo.name);
//		System.out.println(Demo.id);
		
		Test test = new Demo();
		test.login();
		test.register();
		
		// Test test1 = new Student();
		
	}
	
}
