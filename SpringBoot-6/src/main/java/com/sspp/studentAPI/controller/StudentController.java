package com.sspp.studentAPI.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sspp.studentAPI.entity.Student;

@Controller
public class StudentController {

	@GetMapping("/welcome")
	public ModelAndView welcome()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		mav.addObject("name", "chandrakant");
		mav.addObject("lastName", "Bhosale");
		mav.addObject("studentName", Arrays.toString(new String[] {"priyanka","Shivraj","Dyanraj"}));
		 
		
		return mav;
	}

	@GetMapping("/register")
	public ModelAndView register()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("register");
		mav.addObject("list", List.of(1,2,3,4,5));
		
		Student st1 = new Student();
		st1.setId(11);
		st1.setName("Ram");
		st1.setMarks(55.55);
		
		Student st2 = new Student();
		st2.setId(12);
		st2.setName("chandrakant");
		st2.setMarks(66.66);
		
		mav.addObject("students", List.of(st1, st2));
		
		
		
		return mav;
	}

	@GetMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("login");
		
		return mav;
	}

}
