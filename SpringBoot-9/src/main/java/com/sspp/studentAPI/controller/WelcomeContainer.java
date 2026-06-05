package com.sspp.studentAPI.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WelcomeContainer {

	@GetMapping({"/welcome","/home","/"})
	public String welcome(Model model)
	{
		model.addAttribute("message", "Hello Chandrakant How are you!!!");
		model.addAttribute("names", List.of("chandrakant","Priyanka","Shivraj"));
		return "welcome";
	}
	
	@GetMapping("/product-form")
	public String ProductForm()
	{
		return "product-form";
	}
	
}
