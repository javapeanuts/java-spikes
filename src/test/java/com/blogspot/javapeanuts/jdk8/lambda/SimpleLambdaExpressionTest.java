package com.blogspot.javapeanuts.jdk8.lambda;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleLambdaExpressionTest {
	private static interface Function {
		public abstract int eval(int x, int y);
	}

	@Test
	public void useLambdaAsFunctionalInterfaceImplementor() throws Exception {
		Function lambda = (int a, int b) -> a + b;
		assertEquals(10, lambda.eval(2, 8));
	}
}
