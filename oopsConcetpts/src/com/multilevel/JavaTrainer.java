package com.multilevel;

public class JavaTrainer extends Trainer{

	String porject;
	
	void setJavaTrainerData(String project)
	{
		this.porject = project;
	}
	
	void showJavaTrainer()
	{
		System.out.println("Project     : "+porject);
	}
	
	public static void main(String[] args) {
		
		JavaTrainer j = new JavaTrainer();
		
		j.setPersonData("Chandraknt", 20, "Pune");
		j.showPerson();
		
		j.setTrainerData(11111, "Chandra B");
		j.showTrainer();
		
		j.setJavaTrainerData("Java Project");
		j.showJavaTrainer();
		
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
