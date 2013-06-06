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
	
	@Test
	public void getBitFieldUsingAnd() throws Exception {
		int field = 20;
		assertTrue((field & 16) != 0);
		assertTrue((field & 4) != 0);
		assertTrue((field & 8) == 0);
	}
}
