package com.day3.zzjava8Examples;

public class Book {

	private int id;
	
	private String name;
	
	private int qty;

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", qty=" + qty + "]";
	}

	public Book(int id, String name, int qty) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
