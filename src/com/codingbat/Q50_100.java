package com.codingbat;

import org.junit.Test;

import junit.framework.Assert;

public class Q50_100 {

	/*
	 * Given two strings, a and b, return the result of putting them together in the
	 * order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	 * 
	 * 
	 * makeAbba("Hi", "Bye") → "HiByeByeHi" makeAbba("Yo", "Alice") →
	 * "YoAliceAliceYo" makeAbba("What", "Up") → "WhatUpUpWhat"
	 */

	public String makeAbba(String a, String b) {

		return a + b + b + a;

	}

	@Test
	public void makeabbatest() {
		Assert.assertEquals(makeAbba("Hi", "Bye"), "HiByeByeHi");
		Assert.assertEquals(makeAbba("Yo", "Alice"), "YoAliceAliceYo");
		Assert.assertEquals(makeAbba("What", "Up"), "WhatUpUpWhat");
		Assert.assertEquals(makeAbba("Hi", "Bye"), "HiByeByeHi");
	}

	/*
	 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as
	 * italic text. In this example, the "i" tag makes <i> and </i> which surround
	 * the word "Yay". Given tag and word strings, create the HTML string with tags
	 * around the word, e.g. "<i>Yay</i>".
	 * 
	 * 
	 * makeTags("i", "Yay") → "<i>Yay</i>" makeTags("i", "Hello") → "<i>Hello</i>"
	 * makeTags("cite", "Yay") → "<cite>Yay</cite>"
	 */

	public String makeTags(String tag, String word) {

		return "<" + tag + ">" + word + "</" + tag + ">";
	}

	@Test
	public void makeTagstest() {
		Assert.assertEquals(makeTags("i", "Yay"), "<i>Yay</i>");
		Assert.assertEquals(makeTags("i", "Hello"), "<i>Hello</i>");
		Assert.assertEquals(makeTags("cite", "Yay"), "<cite>Yay</cite>");

	}

	/*
	 * Given an "out" string length 4, such as "<<>>", and a word, return a new
	 * string where the word is in the middle of the out string, e.g. "<<word>>".
	 * Note: use str.substring(i, j) to extract the String starting at index i and
	 * going up to but not including index j.
	 * 
	 * 
	 * makeOutWord("<<>>", "Yay") → "<<Yay>>" makeOutWord("<<>>", "WooHoo") →
	 * "<<WooHoo>>" makeOutWord("[[]]", "word") → "[[word]]"
	 */

	public String makeOutWord(String out, String word) {

		return word;

	}

	/*
	 * Given a string, return a new string made of 3 copies of the last 2 chars of
	 * the original string. The string length will be at least 2.
	 * 
	 * 
	 * extraEnd("Hello") → "lololo" extraEnd("ab") → "ababab" extraEnd("Hi") →
	 * "HiHiHi"
	 */

	public String extraEnd(String str) {

		String sub = str.substring(str.length() - 2);
		return sub + sub + sub;

	}

	@Test
	public void extraEndtest() {
		Assert.assertEquals(extraEnd("Hello"), "lololo");
		Assert.assertEquals(extraEnd("ab"), "ababab");
		Assert.assertEquals(extraEnd("Hi"), "HiHiHi");

	}

	/*
	 * Given a string, return the string made of its first two chars, so the String
	 * "Hello" yields "He". If the string is shorter than length 2, return whatever
	 * there is, so "X" yields "X", and the empty string "" yields the empty string
	 * "". Note that str.length() returns the length of a string.
	 * 
	 * 
	 * firstTwo("Hello") → "He" firstTwo("abcdefg") → "ab" firstTwo("ab") → "ab"
	 */

	public String firstTwo(String str) {

		return str.length() <= 2 ? str.substring(0) : str.substring(0, 2);

	}

	@Test
	public void firstTwotest() {
		Assert.assertEquals(firstTwo("Hello"), "He");
		Assert.assertEquals(firstTwo("abcdefg"), "ab");
		Assert.assertEquals(firstTwo("ab"), "ab");

	}

	/*
	 * Given a string of even length, return the first half. So the string "WooHoo"
	 * yields "Woo".
	 * 
	 * 
	 * firstHalf("WooHoo") → "Woo" firstHalf("HelloThere") → "Hello"
	 * firstHalf("abcdef") → "abc"
	 */

	public String firstHalf(String str) {

		int end = str.length();
		int len = 0;
		String y = "";
		if (end % 2 == 0)
			len = end / 2;
		else
			len = (end + 1) / 2;

		for (int i = 0; i < len; i++) {
			y = y + str.charAt(i);
		}

		return y;

	}

	@Test
	public void firstHalftest() {
		Assert.assertEquals(firstHalf("WooHoo"), "Woo");
		Assert.assertEquals(firstHalf("HelloThere"), "Hello");
		Assert.assertEquals(firstHalf("abcdef"), "abc");

	}

	/*
	 * Given a string, return a version without the first and last char, so "Hello"
	 * yields "ell". The string length will be at least 2.
	 * 
	 * 
	 * withoutEnd("Hello") → "ell" withoutEnd("java") → "av" withoutEnd("coding") →
	 * "odin"
	 */

	public String withoutEnd(String str) {

		int end = str.length();
		return str.substring(1, end - 1);

	}

	@Test
	public void withoutEndtest() {
		Assert.assertEquals(withoutEnd("Hello"), "ell");
		Assert.assertEquals(withoutEnd("java"), "av");
		Assert.assertEquals(withoutEnd("coding"), "odin");

	}

	/*
	 * Given 2 strings, a and b, return a string of the form short+long+short, with
	 * the shorter string on the outside and the longer string on the inside. The
	 * strings will not be the same length, but they may be empty (length 0).
	 * 
	 * 
	 * comboString("Hello", "hi") → "hiHellohi" comboString("hi", "Hello") →
	 * "hiHellohi" comboString("aaa", "b") → "baaab"
	 */

	public String comboString(String a, String b) {

		return a.length() > b.length() ? b + a + b : a + b + a;

	}

	@Test
	public void comboStringtest() {
		Assert.assertEquals(comboString("Hello", "hi"), "hiHellohi");
		Assert.assertEquals(comboString("hi", "Hello"), "hiHellohi");
		Assert.assertEquals(comboString("aaa", "b"), "baaab");

	}

	/*
	 * Given 2 strings, return their concatenation, except omit the first char of
	 * each. The strings will be at least length 1.
	 * 
	 * 
	 * nonStart("Hello", "There") → "ellohere" nonStart("java", "code") → "avaode"
	 * nonStart("shotl", "java") → "hotlava"
	 */

	public String nonStart(String a, String b) {
		return a.substring(1) + b.substring(1);
	}

	@Test
	public void nonStarttest() {
		Assert.assertEquals(nonStart("Hello", "There"), "ellohere");
		Assert.assertEquals(nonStart("java", "code"), "avaode");
		Assert.assertEquals(nonStart("shotl", "java"), "hotlava");

	}

	/*
	 * Given a string, return a "rotated left 2" version where the first 2 chars are
	 * moved to the end. The string length will be at least 2.
	 * 
	 * 
	 * left2("Hello") → "lloHe" left2("java") → "vaja" left2("Hi") → "Hi"
	 */

	public String left2(String str) {

		return str.substring(2) + str.substring(0, 2);
	}

	/*
	 * Given a string, return a "rotated right 2" version where the last 2 chars are
	 * moved to the start. The string length will be at least 2.
	 * 
	 * 
	 * right2("Hello") → "loHel" right2("java") → "vaja" right2("Hi") → "Hi"
	 * 
	 */

	public String right2(String str) {
		return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
	}

	/*
	 * Given a string, return a string length 1 from its front, unless front is
	 * false, in which case return a string length 1 from its back. The string will
	 * be non-empty.
	 * 
	 * 
	 * theEnd("Hello", true) → "H" theEnd("Hello", false) → "o" theEnd("oh", true) →
	 * "o"
	 */

	public String theEnd(String str, boolean front) {

		if (front) {

			return str.substring(0, 1);

		} else
			return str.substring(str.length() - 1);

	}

	@Test
	public void theEndtest() {
		Assert.assertEquals(theEnd("Hello", true), "H");
		Assert.assertEquals(theEnd("Hello", false), "o");
		Assert.assertEquals(theEnd("oh", true), "o");

	}

	/*
	 * Given a string, return a version without both the first and last char of the
	 * string. The string may be any length, including 0.
	 * 
	 * 
	 * withouEnd2("Hello") → "ell" withouEnd2("abc") → "b" withouEnd2("ab") → ""
	 * 
	 */

	public String withouEnd2(String str) {

		if (str.length() > 1)
			return str.substring(1, str.length() - 1);
		else
			return "";

	}

	/*
	 * Given a string of even length, return a string made of the middle two chars,
	 * so the string "string" yields "ri". The string length will be at least 2.
	 * 
	 * 
	 * middleTwo("string") → "ri" middleTwo("code") → "od" middleTwo("Practice") →
	 * "ct"
	 */

	public String middleTwo(String str) {

		if (str.length() >= 2) {
			return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);

		} else
			return "";

	}

	@Test
	public void middleTwotest() {
		Assert.assertEquals(middleTwo("string"), "ri");
		Assert.assertEquals(middleTwo(""), "");
		Assert.assertEquals(middleTwo("Practice"), "ct");

	}

	/*
	 * Given a string, return true if it ends in "ly".
	 * 
	 * 
	 * endsLy("oddly") → true endsLy("y") → false endsLy("oddy") → false
	 */
	public boolean endsLy(String str) {
		if (str.length() >= 2)
			return str.substring(str.length() - 2).equals("ly") ? true : false;
		else
			return false;
	}

	/*
	 * Given a string and an int n, return a string made of the first and last n
	 * chars from the string. The string length will be at least n.
	 * 
	 * 
	 * nTwice("Hello", 2) → "Helo" nTwice("Chocolate", 3) → "Choate"
	 * nTwice("Chocolate", 1) → "Ce"
	 */

	public String nTwice(String str, int n) {

		return str.substring(0, n) + str.substring(str.length() - n);
	}

	/*
	 * Given a string and an index, return a string length 2 starting at the given
	 * index. If the index is too big or too small to define a string length 2, use
	 * the first 2 chars. The string length will be at least 2.
	 * 
	 * 
	 * twoChar("java", 0) → "ja" twoChar("java", 2) → "va" twoChar("java", 3) → "ja"
	 */

	/*
	 * Given a string of odd length, return the string length 3 from its middle, so
	 * "Candy" yields "and". The string length will be at least 3.
	 * 
	 * 
	 * middleThree("Candy") → "and" middleThree("and") → "and"
	 * middleThree("solving") → "lvi"
	 */

	public String middleThree(String str) {

		return str.substring(((str.length() - 1) / 2) - 1, ((str.length() - 1) / 2) + 2);
	}

	/*
	 * Given a string, return a string length 2 made of its first 2 chars. If the
	 * string length is less than 2, use '@' for the missing chars.
	 * 
	 * 
	 * atFirst("hello") → "he" atFirst("hi") → "hi" atFirst("h") → "h@"
	 */
	public String atFirst(String str) {
		if (str.length() < 2) {
			return str + "@";
		} else {
			return str.substring(0, 2);
		}
	}

//	@Test
//	public void atFirsttest() {
//		Assert.assertEquals(atFirst("hello"), "he");
//		Assert.assertEquals(atFirst(""), "@@");
//		Assert.assertEquals(atFirst("j"), "j@");
//		Assert.assertEquals(atFirst("java"), "ja");
//	}

	/*
	 * Given 2 strings, a and b, return a new string made of the first char of a and
	 * the last char of b, so "yo" and "java" yields "ya". If either string is
	 * length 0, use '@' for its missing char.
	 * 
	 * 
	 * lastChars("last", "chars") → "ls" lastChars("yo", "java") → "ya"
	 * lastChars("hi", "") → "h@"
	 */

	public String lastChars(String a, String b) {

		String str = "";

		if (a == "") {
			str = a;
			return b.substring(0, 1) + "@";
		} else if (b == "") {
			str = b;
			return a.substring(0, 1) + "@";
		}

		else

			return a.substring(0, 1) + b.substring(str.length() - 1);

	}

	@Test
	public void lastCharstest() {
		Assert.assertEquals(lastChars("last", "chars"), "ls");
		Assert.assertEquals(lastChars("yo", "java"), "ya");
		Assert.assertEquals(lastChars("", ""), "@@");
		Assert.assertEquals(lastChars("kitten", ""), "k@");
	}

	/*
	 * Given two strings, append them together (known as "concatenation") and return
	 * the result. However, if the concatenation creates a double-char, then omit
	 * one of the chars, so "abc" and "cat" yields "abcat".
	 * 
	 * 
	 * conCat("abc", "cat") → "abcat" conCat("dog", "cat") → "dogcat" conCat("abc",
	 * "") → "abc"
	 * 
	 */

	public String conCat(String a, String b) {

		if (a.charAt(a.length() - 1) == b.charAt(0))
			return a.substring(0, a.length() - 1) + b.substring(0);

		else
			return a + b;
	}

	@Test
	public void conCatTest() {
		Assert.assertEquals(conCat("abc", ""), "abc");
		Assert.assertEquals(conCat("", "cat"), "cat");
		Assert.assertEquals(conCat("dog", "cat"), "dogcat");
		Assert.assertEquals(conCat("pig", "g"), "pig");

	}

}