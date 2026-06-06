package com.sspp.studentAPI.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sspp.studentAPI.entity.Product;


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
	public String ProductForm(Model model)
	{
		Product product = new Product();
//		product.setId(1111111);
		
		model.addAttribute("product", product);
		return "product-form";
	}
	
	@PostMapping("/save-product")
	public String saveProduct(Product product)
	{
		System.err.println(product);
		
		return "product-form";
	}
	
	
}
