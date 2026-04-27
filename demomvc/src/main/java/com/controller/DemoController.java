package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/first")
	public String firstDemoFunction()
	{
		return "firstmvcresponce";
	}
	
}
