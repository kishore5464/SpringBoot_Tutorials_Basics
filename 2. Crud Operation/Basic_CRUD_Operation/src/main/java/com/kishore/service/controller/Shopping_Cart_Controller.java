package com.kishore.service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kishore.business.interfaces.Business_Shopping_Interface;
import com.kishore.entity.Shopping_Cart;

@RestController
public class Shopping_Cart_Controller {

	@Autowired
	private Business_Shopping_Interface business_Shopping_Interface;

	// CREATE New Shopping Cart
	@PostMapping(value = "/create")
	public Shopping_Cart createNewCart(@RequestBody Shopping_Cart shopping_Cart) {
		return business_Shopping_Interface.createNewCart(shopping_Cart);
	}

	// RETRIEVE All Shopping Cart
	@GetMapping(value = "/getProduct/{cart_id}")
	public Optional<Shopping_Cart> retrieveOneProduct(@PathVariable(value = "cart_id") String cart_id) {
		return business_Shopping_Interface.retrieveOneProduct(Integer.parseInt(cart_id));
	}

	@GetMapping(value = "/getAllProduct")
	public List<Shopping_Cart> retrieveAllProducts() {
		return business_Shopping_Interface.retrieveAllProducts();
	}

	// UPDATE Price for particular Product
	@PutMapping(value = "/updateProduct/{cart_id}")
	public Shopping_Cart updateParticularCart(@PathVariable(value = "cart_id") String cart_id,
			@RequestBody Shopping_Cart shopping_Cart) {
		return business_Shopping_Interface.updateParticularProduct(Integer.parseInt(cart_id), shopping_Cart);
	}

	// DELETE one Product from Shopping Cart
	@DeleteMapping(value = "/deleteProduct/{cart_id}")
	public void deleteParticularCart(@PathVariable(value = "cart_id") String cart_id) {
		business_Shopping_Interface.deleteParticularCart(Integer.parseInt(cart_id));
	}

	@DeleteMapping(value = "/deleteAllProduct")
	public void deleteAllProductFromCart() {
		business_Shopping_Interface.deleteAllProductFromCart();
	}
}
