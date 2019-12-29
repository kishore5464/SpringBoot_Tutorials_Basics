package com.kishore.password.generator;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encrypt_Decrypt_Password {

	public static void main(String[] args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println(bCryptPasswordEncoder.encode("r@123"));
		System.out.println(bCryptPasswordEncoder.encode("k@123"));
	}
}
