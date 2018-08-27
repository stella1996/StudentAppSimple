package com.student.studentapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	@RequestMapping("/hello")
	public String welcomeMessage() {
		
		return "hello world";
		
	}

}
