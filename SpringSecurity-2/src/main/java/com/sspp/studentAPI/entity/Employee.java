package com.sspp.studentAPI.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

	
	private String mobileNo;
	
	private String dep;
	
	private Double salary;
	
	private LocalDate joiningDate;
	
	private LocalDate dob;
	
	private String status;
	
	private Boolean isMarried;
	
	private Integer experience;
	
	private String educationQualification;
	
	private String address;
	
	private Integer age;
	
	private String destination;
	
	
}
