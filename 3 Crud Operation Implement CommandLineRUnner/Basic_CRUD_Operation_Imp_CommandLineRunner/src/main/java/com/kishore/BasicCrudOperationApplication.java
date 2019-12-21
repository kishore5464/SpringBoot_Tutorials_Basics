package com.kishore;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kishore.business.interfaces.Business_Shopping_Interface;
import com.kishore.entity.Shopping_Cart;

@SpringBootApplication
public class BasicCrudOperationApplication implements CommandLineRunner {

	@Autowired
	private Business_Shopping_Interface business_Shopping_Interface;

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {

		SpringApplication.run(BasicCrudOperationApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Shopping_Cart shopping_Cart = new Shopping_Cart(1, "MacBook Air", 2, 61000.50, new Date());
		business_Shopping_Interface.createNewCart(shopping_Cart);

		System.out.println("Data Source --> " + dataSource.toString());

	}

}
