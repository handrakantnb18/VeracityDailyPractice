package com.demo;

public class DemoTwo implements Runnable {

	@Override
	public void run() {
		String str = "=*=*=*=*=* chandrakant bhosale =*=*=*=*=*=";
		
		char []c= str.toCharArray();
		
//		for(int i = 0; i<c.length; i++)
//		{
//			System.out.println(c[i]);
//		}
		
		for(int i=0;i<c.length;i++)
		{
			try
			{
			Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.print(c[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		DemoTwo demoTwo = new DemoTwo();
		
		Thread t1 = new Thread(demoTwo);
		t1.start();
	}
}
