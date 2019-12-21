package com.kishore.business.interfaces;

import java.util.List;
import java.util.Optional;

import com.kishore.entity.Shopping_Cart;

public interface Business_Shopping_Interface {

	// CREATE New Shopping Cart
	public Shopping_Cart createNewCart(Shopping_Cart shopping_Cart);

	// RETRIEVE All Shopping Cart
	public Optional<Shopping_Cart> retrieveOneProduct(Integer cart_id);

	public List<Shopping_Cart> retrieveAllProducts();

	// UPDATE Price for particular Product
	public Shopping_Cart updateParticularProduct(Integer cart_id, Shopping_Cart shopping_Cart);

	// DELETE one Product from Shopping Cart
	public void deleteParticularCart(Integer cart_id);

	public void deleteAllProductFromCart();

}
