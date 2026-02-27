package com.multilevel;

public class Trainer extends Person{

	int trainerId;
	String subject;
	
	void setTrainerData(int trinerid, String subject)
	{
		this.trainerId = trinerid;
		this.subject = subject;
	}
	
	void showTrainer()
	{
		System.out.println("Trainer id  : "+trainerId);
		System.out.println("Subject     : "+subject);
	}
}
