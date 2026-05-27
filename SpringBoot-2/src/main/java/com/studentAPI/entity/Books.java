package com.studentAPI.entity;

import java.awt.print.Book;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Books {

	private Integer id;
	
	private String name;
	
	private Double price;
	
	private Integer qty;
	
	public static void main(String[] args) {
		
		Book b = new Books(null, null, null, null);
		b.setId(100);
	}
	 
	
}
