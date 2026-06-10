package com.sspp.studentAPI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class AppException {

	@ExceptionHandler(value = StudentNotFoundException.class)
	public String handleStudentNotFoundException(Exception e)
	{
		return e.getMessage();
	}
}
