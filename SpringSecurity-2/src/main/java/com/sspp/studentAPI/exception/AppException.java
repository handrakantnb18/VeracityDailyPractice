package com.sspp.studentAPI.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppException {

	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e)
	{
		return e.getMessage();
	}
}
