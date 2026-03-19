package com.hashset;

public class Student {

	private int stdId;
	
	private String stdName;
	
	private String city;
	
	private String stdCourse;
	
	private double marks;

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", city=" + city + ", stdCourse=" + stdCourse
				+ ", marks=" + marks + "]";
	}

	public Student(int stdId, String stdName, String city, String stdCourse, double marks) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.city = city;
		this.stdCourse = stdCourse;
		this.marks = marks;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStdCourse() {
		return stdCourse;
	}

	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
		
}
