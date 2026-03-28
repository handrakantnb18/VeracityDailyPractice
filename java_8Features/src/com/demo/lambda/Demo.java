package com.demo.lambda;

public class Demo {

	public static void main(String[] args) {
		
//		Test t = () ->
//		{
//			System.out.println("Add ");
//		};
		
		Test t = () -> System.out.println("Add");
		
		t.add();
	}
}
