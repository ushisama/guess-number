package com.thoughtworks.consultancy.joshua.codekata.guessnumbers;

import java.util.Map;

public class GuessNumber {

	public String getResult(int i, int answer) {
		NumberSpliter numberSpliter = new NumberSpliter();
		Map<Integer, Integer> inputMap = numberSpliter.splitNumber(i);
		Map<Integer, Integer> answerMap = numberSpliter.splitNumber(answer);

		int anum = 0;
		int bnum = 0;
		for (Integer inputInt : inputMap.keySet()) {
			if (answerMap.get(inputInt) != null) {
				if (answerMap.get(inputInt) == inputMap.get(inputInt)) {
					anum++;
				} else {
					bnum++;
				}
			}
		}

		return anum + "A" + bnum + "B";
	}
}
