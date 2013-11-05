package com.thoughtworks.consultancy.joshua.codekata.guessnumbers;

import java.util.HashMap;
import java.util.Map;

public class NumberSpliter {

	public Map<Integer, Integer> splitNumber(int i) {
		int number1 = i / 1000;
		int number2 = i % 1000 / 100;
		int number3 = i % 1000 % 100 / 10;
		int number4 = i % 1000 % 100 % 10;

		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		numberMap.put(number1, 1);
		numberMap.put(number2, 2);
		numberMap.put(number3, 3);
		numberMap.put(number4, 4);
		return numberMap;

	}
}
