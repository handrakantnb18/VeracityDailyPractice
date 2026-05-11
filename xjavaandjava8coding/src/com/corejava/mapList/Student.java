package com.corejava.mapList;

public class Student {

	private int id;
	
	private String name;
	
	private String city;
	
	private String univercity;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", univercity=" + univercity + "]";
	}

	public Student(int id, String name, String city, String univercity) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.univercity = univercity;
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

	public String getUnivercity() {
		return univercity;
	}

	public void setUnivercity(String univercity) {
		this.univercity = univercity;
	}
	
	
}
