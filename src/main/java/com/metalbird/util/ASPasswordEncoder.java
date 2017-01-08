package com.metalbird.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

import org.springframework.security.crypto.password.PasswordEncoder;

public class ASPasswordEncoder implements PasswordEncoder {
	private static final String EMPTY_STRING = ""; 
	
	private String getHash(CharSequence input) {
		try {
			
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			md.update(input.toString().getBytes());
			return new String(md.digest());
		} catch (NoSuchAlgorithmException ne) {
			return EMPTY_STRING;
		}
	}

	@Override
	public String encode(CharSequence rawPassword) {
		return getHash(rawPassword);
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return Objects.equals(encodedPassword, encode(rawPassword));
	}
}
