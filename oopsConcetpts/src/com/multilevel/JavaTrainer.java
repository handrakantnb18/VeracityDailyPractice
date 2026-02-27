package com.multilevel;

public class JavaTrainer extends Trainer{

	String porject;
	
	public static void main(String[] args) {
		
		JavaTrainer j = new JavaTrainer();
		
		// using fields to create simple access
		j.name = "Chandraaknt";
		j.age= 25;
		j.address = "Pune";
		j.trainerId = 1011;
		j.subject = "java";
		j.porject = "Java Project";
		
		System.out.println(j.name);
		System.out.println(j.age);
		System.out.println(j.address);
		System.out.println(j.trainerId);
		System.out.println(j.subject);
		System.out.println(j.porject);
	}
}
