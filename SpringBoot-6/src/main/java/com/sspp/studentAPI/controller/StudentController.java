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
		
		Student st = new Student();
		st.setId(11);
		st.setName("Ram");
		st.setMarks(55.55);
		
		
		mav.addObject("student", st);
		
		
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
