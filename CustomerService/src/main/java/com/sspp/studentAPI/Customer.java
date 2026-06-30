package com.sspp.studentAPI;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

	private Integer id;
	
	private String name;
	
	private String email;
	
	private String mobileNo;
	
	private String address;
	
}
