package com.blogspot.javapeanuts.spikes.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class OverflowTest {
	@Test
	public void testMinIntAfterMaxInt() throws Exception {
		assertEquals(Integer.MIN_VALUE, Integer.MAX_VALUE + 1);
	}
	
	@Test
	public void testMaxintForTwoIsMinusTwo() throws Exception {
		assertEquals(-2, Integer.MAX_VALUE * 2);
	}
	
	@Test
	public void testDivideByZero() throws Exception {
		Double inf = 1d / 0;
		assertTrue(inf.isInfinite());
	}
	
	@Test
	public void testNotANumber() throws Exception {
		Double nan = 0d / 0.0;
		assertTrue(nan.isNaN());
	}
}
