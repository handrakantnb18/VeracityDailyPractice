package com.constructortype;


// Default constructor - has no parameters
// it is used to assign default value to an object
// if no constructor is explicitly defined, java provides a default constructor

public class Main {

	Main()
	{
		System.out.println("Default constructor.");
	}
	
	public static void main(String[] args) {
		Main m = new Main();
	}
}
