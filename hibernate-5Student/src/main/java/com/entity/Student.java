package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;

	private String sname;

	private int age;

	private String course;

	private double marks;

	
	// toString method
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", age=" + age + ", course=" + course + ", marks=" + marks
				+ "]";
	}

	// constructor
	public Student(int id, String sname, int age, String course, double marks) {
		super();
		this.id = id;
		this.sname = sname;
		this.age = age;
		this.course = course;
		this.marks = marks;
	}

	// getter and setter method

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

}
