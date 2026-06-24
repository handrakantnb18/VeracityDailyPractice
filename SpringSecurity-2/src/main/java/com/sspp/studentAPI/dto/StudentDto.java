package com.sspp.studentAPI.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class StudentDto {

	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private String mobileNo;
	
	private String standers;
	
	private Integer age;

	@Column(unique = true)
	private String email;
	
	private String address;
	
	private String gender;
	
	private String city;

}
