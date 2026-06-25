package com.sspp.studentAPI.dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class EmployeeDto {

	private Integer id;
	
	private String firstName;

	private String lastName;

	private String gender;

	@Column(unique = true)
	@Email(message= "")
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
