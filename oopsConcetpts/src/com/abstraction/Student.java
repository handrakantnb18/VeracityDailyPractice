package com.abstraction;


// abstract class

public abstract class Student {

	// created methods and variable static but object not created
	
	public Student()
	{
		System.out.println("Student constructor.");
	}
	
	int id;
	
	static String name = "ABC";
	
	void m1()
	{
		
	}
	
	static void m2()
	{
		
	}
	
	// abstract multiple methods created access in child class
	
	abstract void chat(String sender, String reciever);
		
	abstract void login(int x);
	
	abstract void register();
	
	abstract void work();
	
	
	
	public static void main(String[] args) {
		
		// Student s1 = new Student();
		
		
	}
}
