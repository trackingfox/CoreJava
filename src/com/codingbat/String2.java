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

	public int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("hi"))
				count = count + 1;
		}
		return count;
	}

	/*
	 * Return true if the string "cat" and "dog" appear the same number of times in
	 * the given string.
	 * 
	 * 
	 * catDog("catdog") → true catDog("catcat") → false catDog("1cat1cadodog") →
	 * true
	 */

	public boolean catDog(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				count++;
			}
			if (str.substring(i, i + 3).equals("dog")) {
				count--;
			}
		}
		if (count == 0) {
			return true;
		}

		return false;

	}

}
