package com.sspp.studentAPI.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sspp.studentAPI.dto.ProductDto;
import com.sspp.studentAPI.entity.Product;
import com.sspp.studentAPI.exception.ProductNotFoundException;
import com.sspp.studentAPI.repo.ProductRepository;
import com.sspp.studentAPI.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
		
	@Override
	public Product getProductById(Integer id) {
		
		Optional<Product> byId = productRepository.findById(id);
		
		if(byId.isPresent())
		{
			Product product = byId.get();
			
			return product;
			
		}
		
		throw new ProductNotFoundException("Product not found by id : "+id);
	}


	@Override
	public List<Product> getAllproducts() {
		
		List<Product> all = productRepository.findAll();
		
		return all;
		
	}


	@Override
	public String saveProduct(ProductDto productDto) {
 
		Product entity = new Product();
		entity.setName(productDto.getName());
		entity.setPrice(productDto.getPrice());
		entity.setQty(productDto.getQty());
		entity.setCatagory(productDto.getCatagory());
		
		productRepository.save(entity);
		
		return "Product saved successfully.";
		
	}


	@Override
	public Product getProductByName(String name) {
		
		Product product = productRepository.findByName(name);
		
		return product;
	}

}
