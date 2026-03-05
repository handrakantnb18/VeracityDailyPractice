package com.accessmodifiers;

 public class Demo {

	 // default modifiers
	 
	 int age = 25;
	 String name = "Chandrakant";
	 
	 
	 // public modifiers
	 
//	 public int age = 25;
//	 public String name = "Chandrakant";
//	 
	 // private modifiers
	 
//	 private int age = 25;
//	 private String name = "Chandrakant";
//	 
	 // default modifiers
	 
//	 Demo()
//	 {
//		 
//	 }
	 
	 // public modifiers
	 
//	 public Demo()
//	 {
//		 
//	 }
//	 
	  // default modifiers
	 
	 void display()
	 {
		 
	 }
	 
	 //
	 
//	 public void  display()
//	 {
//		 int id = 101;
//	 }
//	 
	 
	 // abstract method
	 
//	   abstract void login();
//	  
//	  abstract void register();
//	  
//	  abstract int payment();
//	  
	 
	 
	public static void main(String[] args) {
		Demo d = new Demo();
		
		System.out.println(d.age);
		System.out.println(d.name);
		
		// int a = d.display(25);
		// System.out.println(a);
	}
	
}
