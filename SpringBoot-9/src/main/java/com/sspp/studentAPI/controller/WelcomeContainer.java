package com.sspp.studentAPI.controller;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	
	@PostMapping("/save")
	public String saveProduct(Product product, @RequestParam("image") MultipartFile file) throws Exception
	{
//		System.err.println(product);
		
//		System.out.println(file.getOriginalFilename());
		
		String fileName = file.getOriginalFilename();
		
		long value = System.currentTimeMillis();
		
		product.setImageName(value + "_" +fileName);
		
		String uploadPath = "C:\\Users\\CHANDRAKANT\\OneDrive\\Desktop\\resume\\";
		
		file.transferTo(new File(uploadPath + value + "_" + fileName));
		
		System.out.println(product);
		
		return "product-form";
	}
	
	
}
