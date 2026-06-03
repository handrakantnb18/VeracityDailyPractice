package com.sspp.studentAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
		studentService.saveStudent(student);
		
//		model.addAttribute("msg", "Student Enroll Sucessfully.");
		
		return "redirect:/dashboard";
	}
	
	@GetMapping("/dashboard")
	public String getStudentDashboard()
	{
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
