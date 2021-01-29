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

	/*
	 * Given a string and an int n, return a string made of n repetitions of the
	 * last n characters of the string. You may assume that n is between 0 and the
	 * length of the string, inclusive.
	 * 
	 * 
	 * repeatEnd("Hello", 3) → "llollollo" repeatEnd("Hello", 2) → "lolo"
	 * repeatEnd("Hello", 1) → "o"
	 */

	public String repeatEnd(String str, int n) {
		StringBuilder stbuild = new StringBuilder(n * n);
		String last = str.substring(str.length() - n);
		for (int i = 0; i < n; i++)
			stbuild.append(last);
		return stbuild.toString();
	}

	/*
	 * Given a string and an int n, return a string made of the first n characters
	 * of the string, followed by the first n-1 characters of the string, and so on.
	 * You may assume that n is between 0 and the length of the string, inclusive
	 * (i.e. n >= 0 and n <= str.length()).
	 * 
	 * 
	 * repeatFront("Chocolate", 4) → "ChocChoChC" repeatFront("Chocolate", 3) →
	 * "ChoChC" repeatFront("Ice Cream", 2) → "IcI"
	 */

	public String repeatFront(String str, int n) {
		StringBuilder stbuild = new StringBuilder((n * n + n) / 2);
		for (int i = n; i >= 1; i--) {
			for (int k = 0; k < i; k++)
				stbuild.append(str.charAt(k));
		}
		return stbuild.toString();
	}

	/*
	 * Given two strings, word and a separator sep, return a big string made of
	 * count occurrences of the word, separated by the separator string.
	 * 
	 * 
	 * repeatSeparator("Word", "X", 3) → "WordXWordXWord" repeatSeparator("This",
	 * "And", 2) → "ThisAndThis" repeatSeparator("This", "And", 1) → "This"
	 */

	public String repeatSeparator(String word, String sep, int count) {
		if (count == 0)
			return "";
		StringBuilder stbuild = new StringBuilder(count * word.length() + sep.length() * (count - 1));
		for (int i = 1; i < count; i++) {
			stbuild.append(word);
			stbuild.append(sep);
		}
		stbuild.append(word);
		return stbuild.toString();
	}

	/*
	 * A sandwich is two pieces of bread with something in between. Return the
	 * string that is between the first and last appearance of "bread" in the given
	 * string, or return the empty string "" if there are not two pieces of bread.
	 * 
	 * 
	 * getSandwich("breadjambread") → "jam" getSandwich("xxbreadjambreadyy") → "jam"
	 * getSandwich("xxbreadyy") → ""
	 */
	public String getSandwich(String str) {
		int iFirst = str.indexOf("bread");
		int iLast = str.lastIndexOf("bread");
		if (iFirst != -1 && iLast != -1 && iFirst != iLast)
			return str.substring(iFirst + 5, iLast);
		return "";
	}

	/*
	 * Returns true if for every '*' (star) in the string, if there are chars both
	 * immediately before and after the star, they are the same.
	 * 
	 * 
	 * sameStarChar("xy*yzz") → true sameStarChar("xy*zzz") → false
	 * sameStarChar("*xa*az") → true
	 */
	public boolean sameStarChar(String str) {
		int len = str.length() - 1;
		for (int i = 1; i < len; i++) {
			if (str.charAt(i) == '*') {
				if (str.charAt(i - 1) != str.charAt(i + 1))
					return false;
			}
		}
		return true;
	}

	/*
	 * Look for patterns like "zip" and "zap" in the string -- length-3, starting
	 * with 'z' and ending with 'p'. Return a string where for all such words, the
	 * middle letter is gone, so "zipXzap" yields "zpXzp".
	 * 
	 * 
	 * zipZap("zipXzap") → "zpXzp" zipZap("zopzop") → "zpzp" zipZap("zzzopzop") →
	 * "zzzpzp"
	 */

	public String zipZap(String str) {
		int len = str.length();
		int lim = len - 2;
		int i = 0;
		char ch;
		StringBuilder stbuild = new StringBuilder(len);
		while (i < len) {
			ch = str.charAt(i);
			if (ch == 'z' && i < lim && str.charAt(i + 2) == 'p') {
				stbuild.append("zp");
				i += 3;
			} else {
				stbuild.append(ch);
				i++;
			}
		}
		return stbuild.toString();
	}

	/*
	 * Return a version of the given string, where for every star (*) in the string
	 * the star and the chars immediately to its left and right are gone. So "ab*cd"
	 * yields "ad" and "ab**cd" also yields "ad".
	 * 
	 * 
	 * starOut("ab*cd") → "ad" starOut("ab**cd") → "ad" starOut("sm*eilly") →
	 * "silly"
	 */
	public String starOut(String str) {
		int len = str.length();
		int[] indexes = new int[len];
		char ch;
		StringBuilder stbuild = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == '*') {
				indexes[i] = 1;
				if (i >= 1)
					indexes[i - 1] = 1;
				if (i < (len - 1))
					indexes[i + 1] = 1;
			}
		}
		for (int i = 0; i < len; i++) {
			if (indexes[i] == 0)
				stbuild.append(str.charAt(i));
		}
		return stbuild.toString();
	}

	/*
	 * 
	 */
}
