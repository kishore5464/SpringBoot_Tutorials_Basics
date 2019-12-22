package com.kishore.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${my.message}")
	private String message;

	@GetMapping("/")
	public String message() {
		return message;
	}
}
