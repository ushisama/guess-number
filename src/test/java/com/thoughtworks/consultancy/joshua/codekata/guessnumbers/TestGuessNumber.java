package com.thoughtworks.consultancy.joshua.codekata.guessnumbers;

import org.junit.Test;

import junit.framework.TestCase;

public class TestGuessNumber extends TestCase {
	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testGuessNumber() {
		GuessNumber guessNumber = new GuessNumber();
		assertEquals("4A0B", guessNumber.getResult(1234));
	}
}
