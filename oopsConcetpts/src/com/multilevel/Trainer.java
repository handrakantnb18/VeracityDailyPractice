package com.multilevel;

public class Trainer extends Person{

	int trainerId;
	String subject;
	
	Trainer(int trainerId, String subject, String name, int age, String address)
	{
		super(name, age, address);
		this.trainerId = trainerId;
		this.subject = subject;
		//System.out.println("Trainer 1 param constructor.");
	}
	
	
//	void setTrainerData(int trinerid, String subject, String name, int age, String address)
//	{
//		this.trainerId = trinerid;
//		this.subject = subject;
//		super.setPersonData(name, age, address);
//	}
	
	void showTrainer()
	{
		showPerson();
		System.out.println("Trainer id  : "+trainerId);
		System.out.println("Subject     : "+subject);
	}
}
