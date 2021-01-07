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

}
