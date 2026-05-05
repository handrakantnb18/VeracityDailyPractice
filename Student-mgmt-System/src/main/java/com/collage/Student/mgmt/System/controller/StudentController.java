package com.collage.Student.mgmt.System.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collage.Student.mgmt.System.entity.StudentEntity;
import com.collage.Student.mgmt.System.repository.StudentRepository;
import com.collage.Student.mgmt.System.services.StudentService;

@RestController
@RequestMapping("/demo")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello from controller layer";
	}

	@PostMapping("/saveStudent")
	public StudentEntity addStudent(@RequestBody StudentEntity studentEntity)
	{
		return studentRepository.save(studentEntity);
		
		
	}
	
	@GetMapping("/getStudentById/{id}")
	public Optional<StudentEntity> getStudentById(@PathVariable long id) {
		return studentRepository.findById(id);
	}
	
	@PutMapping("/updateStudent/{id}")
	public StudentEntity updateStudentById(@PathVariable long id, @RequestBody StudentEntity student)
	{
		return studentService.updateStudentById(id, student);
	}
	
	@PutMapping("/updateStudent1/{id}")
	public StudentEntity updateStudentById1(@PathVariable long id)
	{
		
		return studentService.updateStudentById1(id);
	}
	
	
	
	
//	public static void main(String[] args) {
//		
//		StudentController studentController = new StudentController();
//		
////		String univercityName2 = studentController.univercityName;
//		
////		System.out.println(univercityName2)
//
//		StudentController.univercityName("pune");
//		
//	}
//
//	private static void univercityName(String string) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
