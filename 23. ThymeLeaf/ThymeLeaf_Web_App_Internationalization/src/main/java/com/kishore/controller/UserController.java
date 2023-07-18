package com.kishore.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.kishore.model.Users;
import com.kishore.service.impl.User_Business_Impl;

@RestController
public class UserController {

	@Autowired
	private User_Business_Impl user_Business_Impl;

	@GetMapping("/createuser")
	public ModelAndView createNewUser(HttpServletRequest httpServletRequest) {
		ModelAndView modelAndView = new ModelAndView("createuser");
		modelAndView.addObject("user", new Users());
		modelAndView.addObject("allProfiles", getProfiles());

		Locale locale = httpServletRequest.getLocale();
		String countryCode = locale.getCountry();
		String countryName = locale.getDisplayCountry();

		String langCode = locale.getLanguage();
		String langName = locale.getDisplayLanguage();

		modelAndView.addObject("countryCode", countryCode);
		modelAndView.addObject("countryName", countryName);
		modelAndView.addObject("langCode", langCode);
		modelAndView.addObject("langName", langName);

		return modelAndView;
	}

	@PostMapping("/createuser")
	public ModelAndView createUser(@Valid Users users, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView();
		if (result.hasErrors()) {
			modelAndView.setViewName("createuser");
			modelAndView.addObject("user", users);
			modelAndView.addObject("allProfiles", getProfiles());
			return modelAndView;
		}
		user_Business_Impl.addUser(users);
		modelAndView.addObject("allUsers", user_Business_Impl.getAllUsers());
		modelAndView.setViewName("userinfo");
		return modelAndView;
	}

	private List<String> getProfiles() {
		List<String> list = new ArrayList<>();
		list.add("Associate");
		list.add("AVP");
		list.add("VP");
		list.add("Director");
		return list;
	}
}
