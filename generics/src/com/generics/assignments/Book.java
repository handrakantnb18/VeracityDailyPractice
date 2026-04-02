package com.generics.assignments;

public class Book {

	private int id;
	
	private String name;
	
	private int price;
	
	private String auther;

	// ToString method
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", auther=" + auther + "]";
	}


	// Constructor
	
	public Book(int id, String name, int price, String auther) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.auther = auther;
	}


	// getter and setter method
	
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


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getAuther() {
		return auther;
	}


	public void setAuther(String auther) {
		this.auther = auther;
	}
	
	
	
}
