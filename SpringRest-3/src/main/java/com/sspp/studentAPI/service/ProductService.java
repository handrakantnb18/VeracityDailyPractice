package com.sspp.studentAPI.service;

import java.util.List;

import com.sspp.studentAPI.dto.ProductDto;
import com.sspp.studentAPI.entity.Product;

public interface ProductService {

	Product getProductById(Integer id);

	List<Product> getAllproducts();
	
	String saveProduct(ProductDto product);
	
	Product getProductByName(String name);
	
}
