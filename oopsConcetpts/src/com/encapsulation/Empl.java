package com.encapsulation;

public class Empl {

	public static void main(String[] args) {
		
		// object created private variable class and access all properties
		
		Employee e = new Employee();
		
		e.setName("Chandrakant");
		System.out.println(e.getName());
		
		e.setEmail("chandrakant18@gmail.com");
		System.out.println(e.getEmail());
		
		e.setGender("Male");
		System.out.println(e.getGender());
		
		e.setDep("Software");
		System.out.println(e.getDep());
		
		e.setSalary("450000");
		System.out.println(e.getSalary());
	}
}
