package com.sspp.studentAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sspp.studentAPI.entity.Student;


@Controller
public class CourseController {

	@GetMapping("/enroll")
	public String getEnrollmentForm(Model model)
	{
		
		Student student = new Student();
		
		model.addAttribute("student", student);
		
		return "enrollment-form";
	}
}
