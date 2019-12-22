package com.kishore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.kishore.utilites.Environments_Config;

@SpringBootApplication
@ComponentScan(basePackages = "com.kishore")
public class DifferentProfilesInterfacesApplication implements CommandLineRunner {

	@Autowired
	Environments_Config environments_Config;

	public static void main(String[] args) {
		SpringApplication.run(DifferentProfilesInterfacesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hai");
		environments_Config.env_setup();
	}

}
