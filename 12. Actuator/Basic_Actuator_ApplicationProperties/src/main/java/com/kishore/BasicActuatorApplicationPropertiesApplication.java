package com.kishore;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kishore.business.impl.Business_Shopping_Impl;
import com.kishore.entity.Shopping_Cart;

@SpringBootApplication
public class BasicActuatorApplicationPropertiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication
				.run(BasicActuatorApplicationPropertiesApplication.class, args);

		Business_Shopping_Impl business_Shopping_Impl = configurableApplicationContext.getBean("business_Shopping_Impl",
				Business_Shopping_Impl.class);
		
		Shopping_Cart shopping_Cart = new Shopping_Cart(1, "MacBook Air", 2, 61000.50, new Date());
		business_Shopping_Impl.createNewCart(shopping_Cart);

	}

}
