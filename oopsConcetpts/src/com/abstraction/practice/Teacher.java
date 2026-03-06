package com.abstraction.practice;

public class Teacher extends Strudent {

	// method of abstract parent class 
	
	void login(String studentname)
	{
		System.out.println("Name is :"+studentname);
	}
	
	void register(String studentname)
	{
		System.out.println("Register name : "+studentname);
	}
	
	void book(String auther)
	{
		System.out.println("auther name : "+auther);
	}
	
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		
		t1.login("Chandraknt");
		
		t1.register("Chandra");
		
		t1.book("The Secret - auther - Rhonda Byrne");
		
		
	}
}
