package com.niceinfoshop.swagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	@GetMapping("/api/javainuse")
	public String sayHello() {
		return "Swagger Hello World111";
	}
	
	@GetMapping("/v3/api-docs/first")
	public String sayHello2() {
		return "Swagger Hello World222";
	}
}
