package com.demo;

public class User implements Runnable {

	@Override
	public void run() {
		
//	System.out.println(10+20);
		
		String str = "my name is chandraaknt bhosale";
		
		char []c = str.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			try
			{
			Thread.sleep(400);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.print(c[i]);
		}
	}
	
	public static void main(String[] args) {
		User u1 = new User();
		
		Thread t1 = new Thread(u1);
		t1.start();
//		t1.sleep(1000);
	}
}
