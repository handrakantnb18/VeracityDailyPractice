package com.generics.practice;

public interface Test {

	void add(int a, int b);

	
	
	public static void main(String[] args) {
		
		Test t = (a, b) ->
		{
			System.out.println("Addition : "+(a+b));
		};
		
		t.add(55, 25);
		
		Test2 t2 = (a, b) ->
		{
			System.out.println(a+b);
		};
		
		t2.add(55.56f, 50.55f);
		
		Test3 t3=(a, b)->
		{
			System.out.println(a+b);
		};
		t3.add(58.89, 40.48);
		
	}
}

interface Test2 {
	void add(float a, float b);
	
	
}

interface Test3 
{
	void add(double a, double b);
	
}