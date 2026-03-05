package com.interface4;

public interface DemoOne {

	void login();
	
	static void m1()
	{
		System.out.println("Static method");
		
	}
	
	private static void m2()
	{
		m1();
		System.out.println("private method");
		
	}
	
	// default method
	public default void m3()
	{
		m2();
		System.out.println("Default method");
		
	}
	
	public static void main(String[] args) {
		// DemoOne.m3();
	}
}
