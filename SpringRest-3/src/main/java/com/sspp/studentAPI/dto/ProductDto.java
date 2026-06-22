package com.sspp.studentAPI.dto;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductDto {

	@NotBlank(message= "Name is required")
	private String name;
	
	@NotNull(message = "Price is required")
	private Double price;
	
	@NotNull(message = "Qty is required")
	private Integer qty; 
	
	@NotBlank(message = "Catagory is required")
	private String catagory;

}
