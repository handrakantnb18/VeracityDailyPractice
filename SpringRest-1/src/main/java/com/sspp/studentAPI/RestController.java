package com.sspp.studentAPI;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	// Rest Controller class is used to create APIS,  return responce API Responce
	// Controller class is used to return frontend VIEW .. reyrn product-form
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome I am using REST APIS";
	}
	
	@GetMapping("/user")
	public Map<String, String> getUser()
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("Vijay", "Student");
		map.put("Chandrakant", "Developer");
		map.put("Subhash", "Engineer");
		
		return map;
		
	}
	
	@GetMapping("/students")
	public Student[] getStudents()
	{
		Student std1 = new Student(1, "chandrakant", 55.55);
		
		Student std2 = new Student(2, "Priyanka", 88.88);
		
		Student std3 = new Student(3, "Sivraj", 99.99);
		
		Student std4 = new Student(4, "Vijay", 77.77);
		
		Student[] students = new Student[4];
		students[0]= std1;
		students[1]= std2;
		students[2]= std3;
		students[3]= std4;
		
		return students;
	}
	
	
}
