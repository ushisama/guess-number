package com.thoughtworks.consultancy.joshua.codekata.guessnumbers;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;

public class TestGuessNumber extends TestCase {
	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testAllA() {
		GuessNumber guessNumber = new GuessNumber();
		assertEquals("4A0B", guessNumber.getResult(1234, 1234));
	}

	@Test
	public void testAllB() {
		GuessNumber guessNumber = new GuessNumber();
		assertEquals("0A4B", guessNumber.getResult(4321, 1234));
	}

	@Test
	public void testAll0() {
		GuessNumber guessNumber = new GuessNumber();
		assertEquals("0A0B", guessNumber.getResult(5678, 1234));
	}

	@Test
	public void test2A2B() {
		GuessNumber guessNumber = new GuessNumber();
		assertEquals("2A2B", guessNumber.getResult(4231, 1234));
	}

	@Test
	public void testNumberSpliter() {
		NumberSpliter numberSpliter = new NumberSpliter();
		Map<Integer, Integer> numberMap = numberSpliter.splitNumber(1234);
		Map<Integer, Integer> expectationNumberMap = new HashMap<Integer, Integer>();
		expectationNumberMap.put(1, 1);
		expectationNumberMap.put(2, 2);
		expectationNumberMap.put(3, 3);
		expectationNumberMap.put(4, 4);
		assertEquals(expectationNumberMap, numberMap);
	}

	@Test
	public void testNumberSpliter_duplicate() {
		NumberSpliter numberSpliter = new NumberSpliter();
		Map<Integer, Integer> numberMap = numberSpliter.splitNumber(4233);
		Map<Integer, Integer> expectationNumberMap = new HashMap<Integer, Integer>();
		expectationNumberMap.put(4, 1);
		expectationNumberMap.put(2, 2);
		expectationNumberMap.put(3, 4);
		assertEquals(expectationNumberMap, numberMap);
	}

	@Test
	public void testNumberSpliter_revert() {
		NumberSpliter numberSpliter = new NumberSpliter();
		Map<Integer, Integer> numberMap = numberSpliter.splitNumber(4321);
		Map<Integer, Integer> expectationNumberMap = new HashMap<Integer, Integer>();
		expectationNumberMap.put(4, 1);
		expectationNumberMap.put(3, 2);
		expectationNumberMap.put(2, 3);
		expectationNumberMap.put(1, 4);
		assertEquals(expectationNumberMap, numberMap);
	}
}
