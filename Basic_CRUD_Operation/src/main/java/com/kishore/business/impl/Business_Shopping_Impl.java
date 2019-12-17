package com.kishore.business.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishore.business.interfaces.Business_Shopping_Interface;
import com.kishore.dao.interfaces.DAO_Shopping_Interface;
import com.kishore.entity.Shopping_Cart;

@Service
public class Business_Shopping_Impl implements Business_Shopping_Interface {

	@Autowired
	private DAO_Shopping_Interface dao_Shopping_Interface;

	@Override
	public Shopping_Cart createNewCart(Shopping_Cart shopping_Cart) {
		// TODO Auto-generated method stub
		return dao_Shopping_Interface.save(shopping_Cart);
	}

	@Override
	public Optional<Shopping_Cart> retrieveOneProduct(Integer cart_id) {
		// TODO Auto-generated method stub
		return dao_Shopping_Interface.findById(cart_id);
	}

	@Override
	public List<Shopping_Cart> retrieveAllProducts() {
		// TODO Auto-generated method stub
		return dao_Shopping_Interface.findAll();
	}

	@Override
	public Shopping_Cart updateParticularProduct(Integer cart_id, Shopping_Cart shopping_Cart) {
		// TODO Auto-generated method stub
		Shopping_Cart shopping = dao_Shopping_Interface.getOne(cart_id);

		shopping.setProduct_name(shopping_Cart.getProduct_name());
		shopping.setQuantity(shopping_Cart.getQuantity());
		shopping.setPrice(shopping_Cart.getPrice());
		shopping.setCreated_date(shopping_Cart.getCreated_date());

		shopping = dao_Shopping_Interface.save(shopping);

		return shopping;
	}

	@Override
	public void deleteParticularCart(Integer cart_id) {
		// TODO Auto-generated method stub
		dao_Shopping_Interface.deleteById(cart_id);
	}

	@Override
	public void deleteAllProductFromCart() {
		// TODO Auto-generated method stub
		dao_Shopping_Interface.deleteAll();
	}

}
