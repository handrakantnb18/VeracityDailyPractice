package com.sspp.studentAPI.entity;

import lombok.Data;

@Data
public class AuthenticateRequest {

	private String username;
	
	private String password;
	
}
