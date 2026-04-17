package com.demo;

public class User implements Runnable {

	@Override
	public void run() {
		
//	System.out.println(10+20);
		
		for(int i=1;i<=5;i++)
		{
			
			System.out.println("Thread is : "+i);
		}
	}
	
	public static void main(String[] args) {
		User u1 = new User();
		
		Thread t1 = new Thread(u1);
		t1.start();
	}
}
