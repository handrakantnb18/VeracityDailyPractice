package com.sspp.studentAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sspp.studentAPI.entity.ContactForm;
import com.sspp.studentAPI.service.EmailService;

@Controller
public class ContactController {

	@Autowired
	private EmailService emailService;
	
	@PostMapping("/contact")
	public String sendContact(@ModelAttribute ContactForm form)
	{
		emailService.sendContactMail(form);
		
		return "success";
	}
	
	@GetMapping("/course/contact")
	public String contactPage()
	{
		return "contact";
	}
	
}
