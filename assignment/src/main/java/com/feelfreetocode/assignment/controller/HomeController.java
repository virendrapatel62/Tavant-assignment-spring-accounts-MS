package com.feelfreetocode.assignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class HomeController {
	
	@GetMapping()
	public String home() {
		return "Hi You Are On Home 🏠";
	}
} 
