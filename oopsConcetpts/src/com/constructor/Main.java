package com.constructor;

public class Main {
	
	String name = "Chandrakant";
	int id = 101;
	
	//  non-parameterized constructor
	
	Main()  // non parameterized
	{
		
		System.out.println("Non-parameterzed constructor");
	}
	
	// parameterized constructor
	
	Main(String name, int id)
	{
		
		this.name = name;
		this.id = id;
		System.out.println("Parameterized constructor");
	}

	public static void main(String[] args) {
		 Main m = new Main();
		 
		 System.out.println(m.name);
		 System.out.println(m.id);
		 
		 Main m2 = new Main();
		 
		 System.out.println(m2.name);
		 System.out.println(m2.id);
		 //Main m1 = new Main();
		
	}
}
