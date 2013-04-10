package com.blogspot.javapeanuts.spikes.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestsTest {
	@Parameters(name = "{index}: {2} == {0} + {1}")
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 0, 0 }, { 2, 2, 4 },
				{ -1, 10, 9 }, { 4, 5, 9 }, { 11, 19, 30 }, { 1, 2, 3 } });
	}

	private int x, y, sum;

	public ParameterizedTestsTest(int x, int y, int sum) {
		this.x = x;
		this.y = y;
		this.sum = sum;
	}

	@Test
	public void calculateSum() throws Exception {
		assertEquals(sum, x + y);
	}
}
