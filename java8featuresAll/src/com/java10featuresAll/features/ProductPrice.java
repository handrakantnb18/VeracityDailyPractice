package com.java10featuresAll.features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductPrice {

	public static void main(String[] args) {
		
		List<Product> list = Arrays.asList(
                new Product(101, "Shivraj", 150, "pune"),
                new Product(102, "Pruthviraj", 120, "Mumbai"),
                new Product(103, "Vishwraj", 800, "Banglore"),
                new Product(104, "Dyanraj",100, "Chennai")
        );
		
		Map<String, List<Product>> map = list.stream()
		        .collect(Collectors.groupingBy(Product::getName));

		System.out.println(map);	
	}
} 
