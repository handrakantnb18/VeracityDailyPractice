package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DemoController {

	@Autowired
	private UserDemo userDemo;
	
	@RequestMapping("/first")
	public String firstDemoFunction()
	{
		return "firstmvcresponce";
	}
	
	@RequestMapping("/second")
	public String saveUser()
	{
		userDemo.saveUser();
		return"showuser";
		
	}
}
