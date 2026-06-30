package com.sspp.studentAPI;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "http://localhost:9090", name = "OrderServices")
public interface OrderClient {

	@GetMapping("/order/{id}")
	Map<String, Object> getOrder(@PathVariable Integer id);
	
}
