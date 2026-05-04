package com.codingInterviewFour;

public class Employee {

	private int id;
	
	private String name;
	
	private String city;
	
	private String collage;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", collage=" + collage + "]";
	}

	public Employee(int id, String name, String city, String collage) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.collage = collage;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}
	
	
}
