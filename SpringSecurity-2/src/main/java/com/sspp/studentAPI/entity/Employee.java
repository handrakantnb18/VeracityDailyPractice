package com.sspp.studentAPI.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private String gender;
	
	@Column(unique = true)
	private String email;
	
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
