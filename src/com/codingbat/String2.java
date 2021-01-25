package com.codingbat;

public class String2 {
	/*
	 * Given a string, return a string where for every char in the original, there
	 * are two chars.
	 * 
	 * 
	 * doubleChar("The") → "TThhee" doubleChar("AAbb") → "AAAAbbbb"
	 * doubleChar("Hi-There") → "HHii--TThheerree"
	 */

	public String doubleChar(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			res = res + str.charAt(i) + str.charAt(i);
		}
		return res;
	}

	/*
	 * Return the number of times that the string "hi" appears anywhere in the given
	 * string.
	 * 
	 * 
	 * countHi("abc hi ho") → 1 countHi("ABChi hi") → 2 countHi("hihi") → 2
	 * 
	 */
}
