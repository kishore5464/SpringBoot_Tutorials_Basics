package com.kishore;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChangingPortUsingMapInterfaceApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ChangingPortUsingMapInterfaceApplication.class, args);

		SpringApplication springApplication = new SpringApplication(ChangingPortUsingMapInterfaceApplication.class);

		Map<String, Object> portConfig = new HashMap<String, Object>();
		portConfig.put("SERVER_PORT", 8090);

		springApplication.setDefaultProperties(portConfig);
		springApplication.run(args);
	}

}
