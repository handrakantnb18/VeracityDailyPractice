package com.day1.aadisirjavaQuestions;

public class Librarie {

	private int id;
	
	private String name;
	
	private int books;

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

	public int getBooks() {
		return books;
	}

	public void setBooks(int books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Librarie [id=" + id + ", name=" + name + ", books=" + books + "]";
	}

	public Librarie(int id, String name, int books) {
		super();
		this.id = id;
		this.name = name;
		this.books = books;
	}
	
	
}
