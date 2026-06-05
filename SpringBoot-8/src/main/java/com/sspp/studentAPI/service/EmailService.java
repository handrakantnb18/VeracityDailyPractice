package com.sspp.studentAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.sspp.studentAPI.entity.ContactForm;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailSender;
	
	public void sendContactMail(ContactForm form)
	{
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setTo("chandrakantnb18@gmail.com");
		message.setSubject("Contact Form : "+form.getSubject());
		
		message.setText(
				"Name : " + form.getName()+ "\n" +
				"Email : " + form.getEmail() + "\n" +
				"Message :\n"+ form.getMessage()
				);
		
		mailSender.send(message);
		
	}
}
