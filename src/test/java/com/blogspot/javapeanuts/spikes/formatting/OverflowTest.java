package com.blogspot.javapeanuts.spikes.formatting;

import static org.junit.Assert.*;

import org.junit.Test;

public class OverflowTest {
	@Test
	public void testMinIntAfterMaxInt() throws Exception {
		assertEquals(Integer.MIN_VALUE, Integer.MAX_VALUE + 1);
	}
}
