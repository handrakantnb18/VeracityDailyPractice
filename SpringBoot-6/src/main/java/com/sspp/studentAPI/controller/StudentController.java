package com.sspp.studentAPI.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@GetMapping("/welcome")
	public ModelAndView welcome()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");
		
		return mav;
	}

	@GetMapping("/register")
	public ModelAndView register()
	{
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("register");
		
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
