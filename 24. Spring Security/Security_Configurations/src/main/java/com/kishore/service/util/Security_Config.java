package com.kishore.service.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class Security_Config extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/college/department/**").hasAnyRole("admin", "user")
				.and().formLogin();

		http.csrf().disable().authorizeRequests().antMatchers("/college/student/**").hasAnyRole("user").and()
				.formLogin();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {

		authenticationManagerBuilder.inMemoryAuthentication().withUser("{noop}roshini").password("roshini@123")
				.roles("user");
		authenticationManagerBuilder.inMemoryAuthentication().withUser("{noop}kishore").password("kicha@123")
				.roles("admin, user");
	}

}
