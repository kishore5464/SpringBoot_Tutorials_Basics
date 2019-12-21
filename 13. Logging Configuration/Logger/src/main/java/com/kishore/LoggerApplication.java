package com.kishore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggerApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoggerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggerApplication.class, args);

		LOGGER.error("ERROR LOGGER");
		LOGGER.info("INFO LOGGER");
		LOGGER.warn("WARNING LOGGER");
		LOGGER.debug("DEBUG LOGGER");
	}

}
