package com.sspp.studentAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class AppException {

	@ExceptionHandler(value = StudentNotFoundException.class)
	public String handleStudentNotFoundException()
	{
		return "errorPage";
	}
}
