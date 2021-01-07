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

}
