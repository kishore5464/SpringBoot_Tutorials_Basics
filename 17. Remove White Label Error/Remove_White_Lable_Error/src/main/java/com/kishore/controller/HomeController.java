package com.kishore.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController implements ErrorController {

	private static final String URL = "/error";

	@Override
	public String getErrorPath() {
		return URL;
	}

	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String message() {
		return "Welcome to SpringBoot";
	}

	@RequestMapping(value = URL, method = RequestMethod.GET)
	public String error_Message() {
		return "No servlet available for this request";
	}
}
