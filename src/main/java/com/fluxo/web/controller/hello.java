package com.fluxo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	
	@GetMapping("/hello")
	public String olaMundo(){
		return "Hello";

	}

}
