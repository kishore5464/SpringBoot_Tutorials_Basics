package com.kishore.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.kishore.controller")
public class WhiteLablePageErrorApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhiteLablePageErrorApplication.class, args);
	}

}
