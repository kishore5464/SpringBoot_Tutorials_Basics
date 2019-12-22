package com.kishore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorPageController {

	@RequestMapping(value = "/message")
	public String message() {
		return "Hello White Page Error";
	}
}
