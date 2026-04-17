package com.demo;

public class Test extends Thread {

	@Override
	public void run() {
		
		System.out.println("First main method");
	}
	
	
	public static void main(String[] args) {
		Test t1 = new Test();
		
//		System.out.println(t1.getName());
		t1.start();
		
		Test t2 = new Test();
		
//		System.out.println(t2.getName());
		t2.start();
		
		Test t3 = new Test();
		
//		System.out.println(t3.getName());
		t3.start();
		
		Test t4 = new Test();
		
//		System.out.println(t4.getName());
		t4.start();
	}
}
