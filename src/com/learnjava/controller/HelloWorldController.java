package com.learnjava.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String helloWorld() {
 
		System.out.println("In HelloWorldController");
		String message = "Hello World";
		return message;
	}
}

