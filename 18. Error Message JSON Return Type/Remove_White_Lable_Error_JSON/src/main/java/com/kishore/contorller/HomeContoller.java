package com.kishore.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {

	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String message() {
		return "Hello World!";
	}

}
