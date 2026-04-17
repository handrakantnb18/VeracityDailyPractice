package com.demo;

public class Demo implements Runnable {

	@Override
	public void run() {

		System.out.println("Run thread : ");
	}
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		Thread t1 = new Thread(demo);
		
		
	}
}
