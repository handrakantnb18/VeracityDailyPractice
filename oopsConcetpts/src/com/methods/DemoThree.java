package com.methods;

public class DemoThree {

	// 3) method with return type and no parameter
	// return type is depends on the value we want to return from the method

	int add() {
		return 100;
		
	}
	
	String get()
	{
		return "Chandrakant";
	}
	
	int take()
	{
		return 100 * 100;
	}
	
	int x()
	{
		return 100 * 100 / 20;
	}

	public static void main(String[] args) {
		DemoThree d3 = new DemoThree();

		int i = d3.x();
		System.out.println(i);
		
		
	}
}
