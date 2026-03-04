package com.interface2;

import com.interface1.Test;

public class Demo implements Test {

	// different package and child class access
	
//	public static void main(String[] args) {
//		System.out.println(Test.id);
//	}
	
	// abstract method super class access to child class
	
	public void login()
	{
		System.out.println("Login");
	}
	
	public void register()
	{
		System.out.println("Login");
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.login();
		d.register();
	}
	
}
