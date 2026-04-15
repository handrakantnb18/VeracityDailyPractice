package com.registerServlet;

import java.io.IOException;

import com.entity.UserLogin;
import com.service.UserLoginService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login-form")

public class ProcessLogin extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
String name = req.getParameter("name");
		
		String password = req.getParameter("password");
		
		System.out.println(name);
		
		System.out.println(password);
		
		UserLogin userLogin = new UserLogin(name, password);
		
		UserLoginService service = new UserLoginService();
		
		String msg = service.saveUserLogin(userLogin);
		
		req.getRequestDispatcher("login-form.jsp").forward(req, resp);
		
		
	}
	
}
