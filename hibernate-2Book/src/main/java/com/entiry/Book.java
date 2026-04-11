package com.entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

	@Id
	private int id;
	
	private String bookname;
	
	private String auther;
	
	private int price;

	public Book(int id, String bookname, String auther, int price) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.auther = auther;
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + ", auther=" + auther + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
		
}
