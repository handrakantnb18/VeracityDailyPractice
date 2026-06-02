package com.sspp.studentAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name ="course_Enrolled_Students")
@Data
 
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String course;
	
	private String gender;
	
	private String[] timing;
	
	private String email;
	
	private String mobileNo;
	
	private String address;
	
	private double courseFees;
}