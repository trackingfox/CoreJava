package com.codingbat;

public class String3 {

	/*
	 * Given two strings, base and remove, return a version of the base string where
	 * all instances of the remove string have been removed (not case sensitive).
	 * You may assume that the remove string is length 1 or more. Remove only
	 * non-overlapping instances, so with "xxx" removing "xx" leaves "x".
	 * 
	 * 
	 * withoutString("Hello there", "llo") → "He there" withoutString("Hello there",
	 * "e") → "Hllo thr" withoutString("Hello there", "x") → "Hello there"
	 */

	public String withoutString(String base, String remove) {

		base = base.replace(remove.toUpperCase(), "");
		base = base.replace(remove.toLowerCase(), "");
		return base.replace(remove, "");
	}

	/*
	 * Given a string, return true if the number of appearances of "is" anywhere in
	 * the string is equal to the number of appearances of "not" anywhere in the
	 * string (case sensitive).
	 * 
	 * 
	 * equalIsNot("This is not") → false equalIsNot("This is notnot") → true
	 * equalIsNot("noisxxnotyynotxisi") → true
	 */
	public boolean equalIsNot(String str) {

		int countIs = 0;
		int countNot = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i + 2 <= str.length() && str.substring(i, i + 2).equals("is"))
				countIs++;
			if (i + 3 <= str.length() && str.substring(i, i + 3).equals("not"))
				countNot++;
		}
		return countIs == countNot;
	}

	/*
	 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
	 * immediately to its left or right. Return true if all the g's in the given
	 * string are happy.
	 * 
	 * 
	 * gHappy("xxggxx") → true gHappy("xxgxx") → false gHappy("xxggyygxx") → false
	 */

	public boolean gHappy(String str) {
		str = str.replaceAll("ggg", "");
		str = str.replaceAll("gg", "");
		return !str.contains("g");
	}

	/*
	 * We'll say that a "triple" in a string is a char appearing three times in a
	 * row. Return the number of triples in the given string. The triples may
	 * overlap.
	 * 
	 * 
	 * countTriple("abcXXXabc") → 1 countTriple("xxxabyyyycd") → 3 countTriple("a")
	 * → 0
	 */

	public int countTriple(String str) {

		int count = 0;
		if (str.length() < 3)
			return 0;

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2))
				count++;
		}
		return count;
	}

	/*
	 * Given a string, return the longest substring that appears at both the
	 * beginning and end of the string without overlapping. For example,
	 * sameEnds("abXab") is "ab".
	 * 
	 * 
	 * sameEnds("abXYab") → "ab" sameEnds("xx") → "x" sameEnds("xxx") → "x"
	 */

	public String sameEnds(String string) {
		String result = "";
		int len = string.length();
		for (int i = 0; i <= len / 2; i++)
			for (int j = len / 2; j < len; j++)
				if (string.substring(0, i).equals(string.substring(j)))
					result = string.substring(0, i);
		return result;
	}

	/*
	 * Given a string, return the sum of the numbers appearing in the string,
	 * ignoring all other characters. A number is a series of 1 or more digit chars
	 * in a row. (Note: Character.isDigit(char) tests if a char is one of the chars
	 * '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
	 * 
	 * 
	 * sumNumbers("abc123xyz") → 123 sumNumbers("aa11b33") → 44 sumNumbers("7 11") →
	 * 18
	 */

	public int sumNumbers(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				int count = 0;
				for (int j = i; j < str.length(); j++) {
					if (Character.isDigit(str.charAt(j)))
						count++;
					else
						break;
				}
				sum += Integer.parseInt(str.substring(i, i + count));
				i += count;
			}
		}
		return sum;
	}

	/*
	 * Given a string, return a string where every appearance of the lowercase word
	 * "is" has been replaced with "is not". The word "is" should not be immediately
	 * preceeded or followed by a letter -- so for example the "is" in "this" does
	 * not count. (Note: Character.isLetter(char) tests if a char is a letter.)
	 * 
	 * 
	 * notReplace("is test") → "is not test" notReplace("is-is") → "is not-is not"
	 * notReplace("This is right") → "This is not right"
	 */

	public String notReplace(String str) {
		String result = "";
		str = " " + str + "  "; // avoid issues with corner cases
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'i') {
				if (str.charAt(i + 1) == 's' && !Character.isLetter(str.charAt(i + 2))
						&& !Character.isLetter(str.charAt(i - 1))) {
					result += "is not";
					i += 1;
				} else
					result += "i";
			} else
				result += str.charAt(i);
		}
		return result.substring(1);
	}

	/*
	 * Given a string, return the length of the largest "block" in the string. A
	 * block is a run of adjacent chars that are the same.
	 * 
	 * 
	 * maxBlock("hoopla") → 2 maxBlock("abbCCCddBBBxx") → 3 maxBlock("") → 0
	 */

	public int maxBlock(String str) {
		int max = 0;
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = i; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j))
					count++;
				else
					break;
			}
			if (count > max)
				max = count;
		}
		return max;
	}

}
