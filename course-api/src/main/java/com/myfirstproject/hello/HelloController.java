package com.myfirstproject.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//requestmapping - get method by default.
	@RequestMapping("/hello")
	public String sayHi() {
		System.out.println("say Hi");
		return "Hi";
	}
	
	
}
