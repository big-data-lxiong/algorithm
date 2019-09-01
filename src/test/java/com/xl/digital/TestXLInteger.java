package com.xl.digital;

import org.junit.Assert;
import org.junit.Test;

public class TestXLInteger {

	@Test
	public void testParsInt() {
		int expected = 0;
		try {
			expected = new XLInteger().parsInt("A", 13);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Assert.assertEquals(expected, 11);
	}

	@Test
	public void testParsInt1() {
		int expected = 0;
		try {
			expected = Integer.parseInt("1", 16);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Assert.assertEquals(expected, 1);
	}

}
