package com.collage.Student.mgmt.System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {
	
	@Id
	private long studentId;
	
	private String studentName;
	
	private String emailId;

	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", emailId=" + emailId + "]";
	}

	public StudentEntity(long studentId, String studentName, String emailId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.emailId = emailId;
	}

	
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	

}
