package com.kishore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home_Controller {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String message() {
		return "Port Number is changed using Map(I)";
	}
}
