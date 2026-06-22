package com.sspp.studentAPI.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class Product {

	@Id
	@NotNull(message= "Id is required")
	private Integer id;
	
	@NotBlank(message= "Name is required")
	private String name;
	
	@NotNull(message = "Price is required")
	private Double price;
	
	@NotNull(message = "Qty is required")
	private Integer qty; 
	
	@NotBlank(message = "Catagory is required")
	private String catagory;

	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
