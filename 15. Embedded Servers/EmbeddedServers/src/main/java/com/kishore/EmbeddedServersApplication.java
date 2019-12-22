package com.kishore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EmbeddedServersApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmbeddedServersApplication.class, args);
	}

}

@RestController
class EmbeddedController {

	@RequestMapping("/")
	public String message() {
		return "Welcome to Embedded Server";
	}
}
