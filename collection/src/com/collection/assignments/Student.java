package com.collection.assignments;

public class Student {

	private int id;
	
	private String name;
	
	private int age;
	
	private String course;
	
	private double marks;
	
	private String college;

	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", course=" + course + ", marks=" + marks
				+ ", college=" + college + "]";
	}
	

	public Student(int id, String name, int age, String course, double marks, String college) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
		this.marks = marks;
		this.college = college;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	
	
}
