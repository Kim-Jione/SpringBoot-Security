package com.example.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
	
	@GetMapping("home")
	public String hello() {
		return	"<h1>home</h1>";
	}
}
