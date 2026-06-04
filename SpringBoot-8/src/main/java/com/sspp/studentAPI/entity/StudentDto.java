package com.sspp.studentAPI.entity;

import lombok.Data;

@Data
public class StudentDto {

private Integer id;
	
	private String name;
	
	private String course;
	
	private String gender;
	
	private String timing;
	
	private String email;
	
	private String mobileNo;
	
	private String address;
	
	private double courseFees;
}
