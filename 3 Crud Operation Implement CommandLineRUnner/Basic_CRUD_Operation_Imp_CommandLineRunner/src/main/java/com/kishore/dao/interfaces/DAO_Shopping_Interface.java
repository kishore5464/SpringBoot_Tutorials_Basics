package com.kishore.dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kishore.entity.Shopping_Cart;

@Repository
public interface DAO_Shopping_Interface extends JpaRepository<Shopping_Cart, Integer> {

}
