package com.kishore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kishore.model.Users;

@Service
public class User_Business_Impl {

	private List<Users> userLists = new ArrayList<Users>();

	public List<Users> getAllUsers() {
		return userLists;
	}

	public void addUser(Users users) {
		userLists.add(users);
	}
}
