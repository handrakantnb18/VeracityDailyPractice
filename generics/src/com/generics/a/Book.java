package com.generics.a;

public class Book {

private int id;
	
	private String name;
	
	private String auther;
	
	private int price;

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", auther=" + auther + ", price=" + price + "]";
	}
	

	public Book(int id, String name, String auther, int price) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
		this.price = price;
	}
	

}
