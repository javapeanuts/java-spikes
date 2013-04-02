package com.blogspot.javapeanuts.spikes.formatting;

import static org.junit.Assert.*;

import java.text.MessageFormat;

import org.junit.Test;

public class MessageFormatTest {
	@Test
	public void formatStringUsingPositionalParameters() throws Exception {
		assertEquals("From |xx| to |yy|", MessageFormat.format("From |{0}| to |{1}|", "xx", "yy"));
	}
}
