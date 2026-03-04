package com.interface1;

public interface Test {

	public static final int id = 10; // public  static   final
	
	String name = "chandr"; // static
	 
	// constructor not accept in interface
//	
//	Test()
//	{
//		
//	}
	
	// instance method not accept
	
//	void m1()
//	{
//		
//	}
//	
	
	// abstract method
	
	void login(); // public abstract
	
	public abstract void register();
	
	public static void main(String[] args) {
		System.out.println(Test.id);
	}
	
}
