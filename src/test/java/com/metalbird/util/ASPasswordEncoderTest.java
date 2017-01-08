package com.metalbird.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ASPasswordEncoderTest {
	private ASPasswordEncoder asPasswordEncoder;
	@Before
	public void setUp() {
		asPasswordEncoder = new ASPasswordEncoder();
	}
	@Test
	public void testEncode() {
		String encode = asPasswordEncoder.encode("admin");
		Assert.assertFalse(encode.isEmpty());
	}
	@Test
	public void testMatches() {
		String pwd = "pass";
		boolean result = asPasswordEncoder.matches(pwd, asPasswordEncoder.encode(pwd));
		Assert.assertTrue(result);
	}

}
