package com.blogspot.javapeanuts.spikes.bitfields;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitFieldsTest {
	@Test
	public void setBitFieldUsingOr() throws Exception {
		int field = 0;
		field = field | 8;
		field = field | 4;
		assertEquals(12, field);
	}
}
