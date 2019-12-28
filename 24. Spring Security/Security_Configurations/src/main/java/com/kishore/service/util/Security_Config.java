package com.kishore.service.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@EnableWebSecurity
public class Security_Config extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/department/**").hasAnyRole("admin", "user").and()
				.formLogin();

		http.csrf().disable().authorizeRequests().antMatchers("/student/**").hasAnyRole("user").and().formLogin();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {

		authenticationManagerBuilder.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
				.withUser("roshini").password("rose@123").roles("user");
		authenticationManagerBuilder.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
				.withUser("kishore").password("kicha@123").roles("admin, user");
	}

}
