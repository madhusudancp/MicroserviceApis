package com.maddy.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetResources {

	/*
	 * Greet for UP and Running
     */
	@GetMapping
	public String greet() {
		return "WELCOME APIS ARE UP AND RUNNING..!";
	}
	
}
