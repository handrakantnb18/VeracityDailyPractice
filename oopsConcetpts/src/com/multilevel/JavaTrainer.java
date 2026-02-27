package com.multilevel;

public class JavaTrainer extends Trainer{

	
	
	JavaTrainer(int trainerId, String subject, String name, int age, String address, String project) {
		super(trainerId, subject, name, age, address);
		this.porject = project;
		showJavaTrainer();
		
		//System.out.println("JavaTrainer 2 param constructor");
	}
	String porject;
	
//	void setJavaTrainerData(String project, int trainerId, String subject, String name, int age, String address)
//	{
//		this.porject = project;
//		super.setTrainerData(trainerId, subject, name, age, address);
//		super.trainerId = trainerId;
//		super.subject = subject;
//				
//	}
	
	void showJavaTrainer()
	{
		showTrainer();
		System.out.println("Project     : "+porject);
	}
	
	public static void main(String[] args) {
		
		 new JavaTrainer(1111, "java", "Chandrakant", 25, "Pune", "Java project");
		
		//j.setPersonData("Chandraknt", 20, "Pune");
		// j.setTrainerData(11111, "Chandra B");
		
		//j.setJavaTrainerData("Java Project", 1011, "Java", "Chandraknt", 25, "Pune");
		
		//j.showPerson();
		//j.showTrainer();
		// j.showJavaTrainer();
		
		// using fields to create simple access
//		j.name = "Chandraaknt";
//		j.age= 25;
//		j.address = "Pune";
		
//		j.trainerId = 1011;
//		j.subject = "java";
		
		// j.porject = "Java Project";
		
//		System.out.println(j.name);
//		System.out.println(j.age);
//		System.out.println(j.address);
//		
//		System.out.println(j.trainerId);
//		System.out.println(j.subject);
		
		// System.out.println(j.porject);
	}
}
