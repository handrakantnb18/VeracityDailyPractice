package com.constructor;

public class StudenTwo {

	
	// constructor types non-parameterized and parameterized contructor
	
	int id;
	String name;
	int age;
	
	StudenTwo() {
		
		System.out.println("Non-parameterized constructor.");
	}
	
	StudenTwo(int id, String name, int age)
	{
		this.name = name;
		this.id= id;
		this.age = age;
		
		show();
		
		// System.out.println("Parameterized constructor.- ");
		
		System.out.println("--------------------------------- ");
	}
	
	void show()
	{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
	
	public static void main(String[] args) {
		
		StudenTwo s1 = new StudenTwo(100, "Chandr", 12);
		
		//s1.show();
		StudenTwo s2 = new StudenTwo(101, "Vijay", 25);
		//s2.show();
		
		StudenTwo s3 = new StudenTwo(102, "Ram", 55);
		//s3.show();
		
	}
}
