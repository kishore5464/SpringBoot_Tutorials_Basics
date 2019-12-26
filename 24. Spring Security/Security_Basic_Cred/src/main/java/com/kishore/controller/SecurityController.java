package com.kishore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping(value = "/message")
	public String message() {
		return "Security Message, Hello :P";
	}
}
