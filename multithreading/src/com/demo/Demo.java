package com.demo;

public class Demo implements Runnable {

	@Override
	public void run() {

//		System.out.println("Run thread : "+Thread.currentThread().getName());
	
		for(int i=1; i<= 15; i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		
			try {
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		Thread t1 = new Thread(demo);
		t1.start();
		
//		Thread t2 = new Thread(demo);
//		t2.start();
//		
//		Thread t3 = new Thread(demo);
//		t3.start();
//		
//		Thread t4 = new Thread(demo);
//		t4.start();
		
		
	}
}
