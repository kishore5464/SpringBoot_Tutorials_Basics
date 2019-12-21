package com.kishore.constructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConstructor {

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World!";
	}
}
