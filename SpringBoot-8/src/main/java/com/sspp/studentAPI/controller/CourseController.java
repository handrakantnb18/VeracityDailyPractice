package com.sspp.studentAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sspp.studentAPI.entity.Student;
import com.sspp.studentAPI.service.StudentService;


@Controller
public class CourseController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/enroll")
	public String getEnrollmentForm(Model model)
	{
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "enrollment-form";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(Student student, Model model)
	{
//		System.err.println(student);
		Student savedStudent = studentService.saveStudent(student);
		
//		model.addAttribute("msg", "Student Enroll Sucessfully.");
		
//		System.err.println(savedStudent.getId());
		
		return "redirect:/dashboard/  "+savedStudent.getId();
	}
	
	@GetMapping("/dashboard/{id}") 
	public String getStudentDashboard(@PathVariable int id)
	{
		System.err.println(id);
		return "dashboard";
	}
	
	@GetMapping("/")
	public String homePage()
	{
		return "home";
	}
	
	@GetMapping("/cources")
	public String getCources()
	{
		return "cources";
	}
	
}
