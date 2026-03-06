package com.encps;

public class Stud {

	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.setName("Chandrakant");
		System.out.println(e1.getName());
		
		e1.setAddress("Pune");
		System.out.println(e1.getAddress());
		
		e1.setMobileno("9876543210");
		System.out.println(e1.getMobileno());
		
		e1.setDep("HR");
		System.out.println(e1.getDep());
	}
}
