package com.constructortype;


// Private constructor - cannot be accessed from outside the class.
// 

class PersonTwenty
{
	private PersonTwenty()
	{
		System.out.println("Private constructor called.");
	}
	
	public static void displayMessage()
	{
		System.out.println("Hello from PersonTwenty class.");
	}
}

public class MainPrivate {

	public static void main(String[] args) {
		
		PersonTwenty.displayMessage();
		
	}
}
