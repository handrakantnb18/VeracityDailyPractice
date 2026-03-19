package com.hashset;

public class Book {

	private int bookId;
	
	private String bookName;
	
	private String auther;
	
	private double price;
	
	private int count;
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", auther=" + auther + ", price=" + price
				+ ", count=" + count + "]";
	}

	public Book(int bookId, String bookName, String auther, double price, int count) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.auther = auther;
		this.price = price;
		this.count = count;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
