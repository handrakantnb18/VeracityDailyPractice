package com.multilevel;

public class Trainer extends Person{

	int trainerId;
	String subject;
	
	void setTrainerData(int trinerid, String subject, String name, int age, String address)
	{
		this.trainerId = trinerid;
		this.subject = subject;
		super.setPersonData(name, age, address);
	}
	
	void showTrainer()
	{
		showPerson();
		System.out.println("Trainer id  : "+trainerId);
		System.out.println("Subject     : "+subject);
	}
}
