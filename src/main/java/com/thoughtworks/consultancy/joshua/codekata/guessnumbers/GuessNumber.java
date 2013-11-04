package com.thoughtworks.consultancy.joshua.codekata.guessnumbers;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

public class GuessNumber {

	public String getResult(int i) {
		String[] goals = { "1", "2", "3", "4" };
		String param = String.valueOf(i);
		int anum = 0;
		int bnum = 0;
		for (int k = 0; k < 4; k++) {
			String a = StringUtils.substring(param, k, k + 1);
			for (String goal : goals) {
				if (goal.equals(a)) {
					if (goals[k].equals(a)) {
						anum++;
					}else {
						bnum++;
					}
				}
			}
		}

		return anum + "A" + bnum + "B";
	}
}
