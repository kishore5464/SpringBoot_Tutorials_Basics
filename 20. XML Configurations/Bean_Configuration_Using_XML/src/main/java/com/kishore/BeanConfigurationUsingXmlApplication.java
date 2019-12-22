package com.kishore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import com.kishore.service.My_Messenger;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class BeanConfigurationUsingXmlApplication implements CommandLineRunner {

	@Autowired
	private My_Messenger my_Messenger;

	public static void main(String[] args) {
		SpringApplication.run(BeanConfigurationUsingXmlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n" + my_Messenger.getMessage() + "\n");
	}

}
