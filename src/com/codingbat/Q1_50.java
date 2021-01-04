package com.codingbat;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Q1_50 {

	/*
	 * The parameter weekday is true if it is a weekday, and the parameter vacation
	 * is true if we are on vacation. We sleep in if it is not a weekday or we're on
	 * vacation. Return true if we sleep in.
	 * 
	 * 
	 * sleepIn(false, false) → true sleepIn(true, false) → false sleepIn(false,true)
	 * → true
	 */
	public boolean sleepIn(boolean weekday, boolean vacation) {

		if (!weekday || vacation)
			return true;
		else
			return false;
	}

	@Test
	public void sleepIntest() {
		Assert.assertEquals(sleepIn(true, false), false);
		Assert.assertEquals(sleepIn(false, false), true);
		Assert.assertEquals(sleepIn(true, true), true);
		Assert.assertEquals(sleepIn(false, true), true);
	}

	/*
	 * 
	 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
	 * if each is smiling. We are in trouble if they are both smiling or if neither
	 * of them is smiling. Return true if we are in trouble.
	 * 
	 * 
	 * monkeyTrouble(true, true) → true monkeyTrouble(false, false) → true
	 * monkeyTrouble(true, false) → false
	 */
	public boolean monkeyTrouble1(boolean aSmile, boolean bSmile) {

		if (aSmile != true && bSmile != true) {
			return true;
		} else if (aSmile == true && bSmile == true) {
			return true;
		} else
			return false;

	}

	public boolean monkeyTrouble2(boolean aSmile, boolean bSmile) {

		if ((!aSmile && !bSmile) || (aSmile && bSmile)) {
			return true;
		} else
			return false;
	}

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		return (!aSmile && !bSmile) || (aSmile && bSmile) ? true : false;
	}

	@Test
	public void monkeyTroubleTest() {
		Assert.assertEquals(monkeyTrouble(true, false), false);
		Assert.assertEquals(monkeyTrouble(true, true), true);
		Assert.assertEquals(monkeyTrouble(false, false), true);
		Assert.assertEquals(monkeyTrouble(false, true), false);
	}

	/*
	 * 
	 * Given an int n, return true if it is within 10 of 100 or 200. Note:
	 * Math.abs(num) computes the absolute value of a number.
	 * 
	 * 
	 * nearHundred(93) → true nearHundred(90) → true nearHundred(89) → false
	 */

	public boolean nearHundred(int n) {
		return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
	}

	// public boolean nearHundred(int n)

	@Test
	public void nearHundred() {
		Assert.assertEquals(nearHundred(93), true);
		Assert.assertEquals(nearHundred(193), true);
		Assert.assertEquals(nearHundred(193), true);
		Assert.assertEquals(nearHundred(183), false);

	}

	/*
	 * Given 2 int values, return true if one is negative and one is positive.
	 * Except if the parameter "negative" is true, then return true only if both are
	 * negative.
	 * 
	 * 
	 * posNeg(1, -1, false) → true posNeg(-1, 1, false) → true posNeg(-4, -5, true)
	 * → true
	 * 
	 */

	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			return (a < 0 && b < 0);
		} else {
			return ((a < 0 && b > 0) || (a > 0 && b < 0));
		}
	}

	@Test
	public void posNeg() {
		Assert.assertEquals(posNeg(1, -1, false), true);
		Assert.assertEquals(posNeg(-1, 1, false), true);
		Assert.assertEquals(posNeg(-4, -5, true), true);
		Assert.assertEquals(posNeg(1, -1, false), true);

	}

	/*
	 * Given a string, return a new string where "not " has been added to the front.
	 * However, if the string already begins with "not", return the string
	 * unchanged. Note: use .equals() to compare 2 strings.
	 * 
	 * 
	 * notString("candy") → "not candy" notString("x") → "not x"
	 * notString("not bad") → "not bad"
	 */

	public String notString(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
			return str;
		}

		return "not " + str;
	}

	@Test
	public void notString() {
		Assert.assertEquals(notString("candy"), "not candy");
		Assert.assertEquals(notString("x"), "not x");
		Assert.assertEquals(notString("not bad"), "not bad");
		Assert.assertEquals(notString("not bad"), "not bad");

	}

	/*
	 * Given a non-empty string and an int n, return a new string where the char at
	 * index n has been removed. The value of n will be a valid index of a char in
	 * the original string (i.e. n will be in the range 0..str.length()-1
	 * inclusive).
	 * 
	 * 
	 * missingChar("kitten", 1) → "ktten" missingChar("kitten", 0) → "itten"
	 * missingChar("kitten", 4) → "kittn"
	 * 
	 * 
	 */
	public String missingChar(String str, int n) {
		String front = str.substring(0, n);

		String rear = str.substring(n + 1, str.length());

		return front + rear;
	}

	@Test
	public void missingChar() {
		Assert.assertEquals(missingChar("kitten", 1), "ktten");
		Assert.assertEquals(missingChar("kitten", 0), "itten");
		Assert.assertEquals(missingChar("kitten", 4), "kittn");
		Assert.assertEquals(missingChar("kitten", 5), "kitte");

	}

	/*
	 * Given a string, return a new string where the first and last chars have been
	 * exchanged.
	 * 
	 * 
	 * frontBack("code") → "eodc" frontBack("a") → "a" frontBack("ab") → "ba"
	 */
	public String frontBack(String str) {
		if (str.length() <= 1)
			return str;

		String mid = str.substring(1, str.length() - 1);

		// last + mid + first
		return str.charAt(str.length() - 1) + mid + str.charAt(0);
	}

	@Test
	public void frontBack() {
		Assert.assertEquals(frontBack("code"), "eodc");
		Assert.assertEquals(frontBack("a"), "a");
		Assert.assertEquals(frontBack("ab"), "ba");
		Assert.assertEquals(frontBack("ab"), "ba");

	}

	/*
	 * Given a string, we'll say that the front is the first 3 chars of the string.
	 * If the string length is less than 3, the front is whatever is there. Return a
	 * new string which is 3 copies of the front.
	 * 
	 * 
	 * front3("Java") → "JavJavJav" front3("Chocolate") → "ChoChoCho" front3("abc")→
	 * "abcabcabc"
	 */

	public String front3(String str) {
		String front;

		if (str.length() >= 3) {
			front = str.substring(0, 3);
		} else {
			front = str;
		}

		return front + front + front;
	}

	@Test
	public void front3() {
		Assert.assertEquals(front3("Java"), "JavJavJav");
		Assert.assertEquals(front3("Chocolate"), "ChoChoCho");
		Assert.assertEquals(front3("abc"), "abcabcabc");
		Assert.assertEquals(front3("abc"), "abcabcabc");

	}

	/*
	 * Given a string, take the last char and return a new string with the last char
	 * added at the front and back, so "cat" yields "tcatt". The original string
	 * will be length 1 or more.
	 * 
	 * 
	 * backAround("cat") → "tcatt" backAround("Hello") → "oHelloo" backAround("a") →
	 * "aaa"
	 */

	public String backAround(String str) {
		// Get the last char
		String last = str.substring(str.length() - 1);
		String finalstring = last + str + last;

		// System.out.println(str + " -> " + finalstring);

		return last + str + last;
	}

	@Test
	public void backAroundtest() {
		Assert.assertEquals(backAround("cat"), "tcatt");
		Assert.assertEquals(backAround("Hello"), "oHelloo");
		Assert.assertEquals(backAround("a"), "aaa");

	}

	/*
	 * Return true if the given non-negative number is a multiple of 3 or a multiple
	 * of 5. Use the % "mod" operator -- see Introduction to Mod
	 * 
	 * 
	 * or35(3) → true or35(10) → true or35(8) → false
	 */
	public boolean or35(int n) {
		return (n % 3 == 0) || (n % 5 == 0);
	}

	@Test
	public void or35() {
		Assert.assertEquals(or35(3), true);
		Assert.assertEquals(or35(10), true);
		Assert.assertEquals(or35(8), false);

	}

	/*
	 * Given a string, take the first 2 chars and return the string with the 2 chars
	 * added at both the front and back, so "kitten" yields"kikittenki". If the
	 * string length is less than 2, use whatever chars are there.
	 * 
	 * 
	 * front22("kitten") → "kikittenki" front22("Ha") → "HaHaHa" front22("abc") →
	 * "ababcab"
	 */
	public String front22(String str) {
		// First figure the number of chars to take
		int take = 2;
		if (take > str.length()) {
			take = str.length();
		}

		String front = str.substring(0, take);
		return front + str + front;
	}

	/*
	 * Given a string, return true if the string starts with "hi" and false
	 * otherwise.
	 * 
	 * 
	 * startHi("hi there") → true startHi("hi") → true startHi("hello hi") → false
	 */
	public boolean startHi(String str) {
		// First test if the string is not at least length 2
		// (so the substring() below does not go past the end).
		if (str.length() < 2)
			return false;

		// Pull out the string of the first two chars
		String firstTwo = str.substring(0, 2);

		// Test if it is equal to "hi"
		if (firstTwo.equals("hi")) {
			return true;
		} else {
			return false;
		}
		// This last part can be shortened to: return(firstTwo.equals("hi"));
	}

	/*
	 * Given two temperatures, return true if one is less than 0 and the other is
	 * greater than 100.
	 * 
	 * 
	 * icyHot(120, -1) → true icyHot(-1, 120) → true icyHot(2, 120) → false
	 */

	public boolean icyHot(int temp1, int temp2) {
		if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
			return true;
		} else {
			return false;
		}
		// Could be written as: return ((temp1 < 0 && ...));
	}

	/*
	 * Given 2 int values, return true if either of them is in the range 10..20
	 * inclusive.
	 * 
	 * 
	 * in1020(12, 99) → true in1020(21, 12) → true in1020(8, 99) → false
	 * 
	 */
	public boolean in1020(int a, int b) {
		return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
	}

	/*
	 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
	 * Given 3 int values, return true if 1 or more of them are teen.
	 * 
	 * 
	 * hasTeen(13, 20, 10) → true hasTeen(20, 19, 10) → true hasTeen(20, 10, 13) →
	 * true
	 */

	public boolean hasTeen(int a, int b, int c) {
		// Here it is written as one big expression,
		// vs. a series of if-statements.
		return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
	}

	/*
	 * Given a string, if the string "del" appears starting at index 1, return a
	 * string where that "del" has been deleted. Otherwise, return the string
	 * unchanged.
	 * 
	 * 
	 * delDel("adelbc") → "abc" delDel("adelHello") → "aHello" delDel("adedbc") →
	 * "adedbc"
	 */

	public String delDel(String str) {
		if (str.length() >= 4 && str.substring(1, 4).equals("del")) {

			return str.substring(0, 1) + str.substring(4);
		}

		return str;

	}

	/*
	 * Return true if the given string contains between 1 and 3 'e' chars.
	 * 
	 * 
	 * stringE("Hello") → true stringE("Heelle") → true stringE("Heelele") → false
	 */
	public boolean stringE(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e')
				count++;
			// alternately: str.substring(i, i+1).equals("e")
		}

		return (count >= 1 && count <= 3);
	}

	public boolean stringE1(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("e"))
				count++;
			// alternately: str.substring(i, i+1).equals("e")
		}

		return (count >= 1 && count <= 3);
	}

	/*
	 * Given a string, return a new string where the last 3 chars are now in upper
	 * case. If the string has less than 3 chars, uppercase whatever is there. Note
	 * that str.toUpperCase() returns the uppercase version of a string.
	 * 
	 * 
	 * endUp("Hello") → "HeLLO" endUp("hi there") → "hi thERE" endUp("hi") → "HI"
	 */

	public String endUp(String str) {
		if (str.length() <= 3)
			return str.toUpperCase();
		int cut = str.length() - 3;
		String front = str.substring(0, cut);
		String back = str.substring(cut); // this takes from cut to the end

		return front + back.toUpperCase();
	}

	/*
	 * Given a string, return true if the string starts with "hi" and false
	 * otherwise.
	 * 
	 * 
	 * startHi("hi there") → true startHi("hi") → true startHi("hello hi") → false
	 */

	public boolean startHello(String str) {
		// First test if the string is not at least length 2
		// (so the substring() below does not go past the end).
		if (str.length() < 2)
			return false;

		// Pull out the string of the first two chars
		String firstTwo = str.substring(0, 2);

		// Test if it is equal to "hi"
		if (firstTwo.equals("hi")) {
			return true;
		} else {
			return false;
		}
		// This last part can be shortened to: return(firstTwo.equals("hi"));
	}

	/*
	 * Given a string and a non-negative int n, we'll say that the front of the
	 * string is the first 3 chars, or whatever is there if the string is less than
	 * length 3. Return n copies of the front;
	 * 
	 * 
	 * frontTimes("Chocolate", 2) → "ChoCho" frontTimes("Chocolate", 3) →
	 * "ChoChoCho" frontTimes("Abc", 3) → "AbcAbcAbc"
	 * 
	 */
	public String frontTimes(String str, int n) {
		int front = 3;
		if (front > str.length()) {
			front = str.length();
		}
		String frontstr = str.substring(0, front);

		String result = "";
		for (int i = 0; i < n; i++) {
			result = result + frontstr;
		}
		return result;
	}

	/*
	 * Count the number of "xx" in the given string. We'll say that overlapping is
	 * allowed, so "xxx" contains 2 "xx".
	 * 
	 * 
	 * countXX("abcxx") → 1 countXX("xxx") → 2 countXX("xxxx") → 3
	 * 
	 * 
	 */
	int countXX(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("xx"))
				count++;
		}
		return count;
	}

	/*
	 * Given a string, return true if the first instance of "x" in the string is
	 * immediately followed by another "x".
	 * 
	 * 
	 * doubleX("axxbb") → true doubleX("axaxax") → false doubleX("xxxxx") → true
	 */

	/*
	 * Given a string, return a new string made of every other char starting with
	 * the first, so "Hello" yields "Hlo".
	 * 
	 * 
	 * stringBits("Hello") → "Hlo" stringBits("Hi") → "H" stringBits("Heeololeo") →
	 * "Hello"
	 */

	public String stringBits(String str) {

		String result = "";
		for (int i = 0; i < str.length(); i += 2) {
			result = result + str.charAt(i);
		}
		return result;
	}

	/*
	 * Given an array of ints, return true if one of the first 4 elements in the
	 * array is a 9. The array length may be less than 4.
	 * 
	 * 
	 * arrayFront9([1, 2, 9, 3, 4]) → true arrayFront9([1, 2, 3, 4, 9]) → false
	 * arrayFront9([1, 2, 3, 4, 5]) → false
	 */

	public boolean arrayFront9(int[] nums) {
		int end = nums.length;
		if (end > 4)
			end = 4;

		for (int i = 0; i < end; i++) {
			if (nums[i] == 9)
				return true;
		}

		return false;
	}

	/*
	 * Given a string, return a version where all the "x" have been removed. Except
	 * an "x" at the very start or end should not be removed.
	 * 
	 * 
	 * stringX("xxHxix") → "xHix" stringX("abxxxcd") → "abcd" stringX("xabxxxcdx") →
	 * "xabcdx"
	 */
	public String stringX(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {

			if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
				result = result + str.substring(i, i + 1); // Could use str.charAt(i) here
			}
		}
		return result;
	}

	/*
	 * Suppose the string "yak" is unlucky. Given a string, return a version where
	 * all the "yak" are removed, but the "a" can be any char. The "yak" strings
	 * will not overlap.
	 * 
	 * 
	 * stringYak("yakpak") → "pak" stringYak("pakyak") → "pak" stringYak("yak123ya")
	 * → "123ya"
	 */

	/*
	 * Given an array of ints, we'll say that a triple is a value appearing 3 times
	 * in a row in the array. Return true if the array does not contain any triples.
	 * 
	 * 
	 * noTriples([1, 1, 2, 2, 1]) → true noTriples([1, 1, 2, 2, 2, 1]) → false
	 * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
	 */
	public boolean noTriples(int[] nums) {
		// Iterate < length-2, so can use i+1 and i+2 in the loop.
		// Return false immediately if every seeing a triple.
		for (int i = 0; i < (nums.length - 2); i++) {
			int first = nums[i];
			if (nums[i + 1] == first && nums[i + 2] == first)
				return false;
		}

		// If we get here ... no triples.
		return true;
	}

	/*
	 * Given an array of ints, return true if one of the first 4 elements in the
	 * array is a 9. The array length may be less than 4.
	 * 
	 * 
	 * arrayFront9([1, 2, 9, 3, 4]) → true arrayFront9([1, 2, 3, 4, 9]) → false
	 * arrayFront9([1, 2, 3, 4, 5]) → false
	 */

	public boolean arrayFront91(int[] nums) {

		// end of the loop
		int length = nums.length;
		int end = 4;
		if (length < 4)
			end = length;

		for (int i = 0; i < end; i++) {
			if (nums[i] == 9)
				return true;
		}
		return false;
	}

	public boolean arrayFront91_v2(int[] nums) {
		int count = 0;
		for (int a : nums) {
			count++;
			if (a == 9 && count < 4)
				return true;
		}
		return false;
	}

	public boolean arrayFront91_v3(int[] nums) {

		// int index = Arrays.stream(nums).filter(x -> x == 7).findFirst().orElse(-1);
		// Arrays.stream(nums).forEach(x -> System.out.print(x));
		// int index = Arrays.stream(nums).filter(i -> nums[i] ==
		// 9).findFirst().orElse(-1);
		// int index = Arrays.stream(nums).filter(x -> x ==
		// 9).boxed().collect(Collectors.toList()).indexOf(9);
		int index = Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(9);

		// System.out.println(" " + index + " text");

		return (index < 4 && index >= 0 ? true : false);

	}

	@Test
	public void arrayFront91() {
		Assert.assertEquals(arrayFront91(new int[] { 1, 2, 9, 4, 5 }), true);
		Assert.assertEquals(arrayFront91(new int[] { 1, 2, 3 }), false);
		Assert.assertEquals(arrayFront91(new int[] { 1, 2, 9 }), true);
		Assert.assertEquals(arrayFront91(new int[] { 1, 2 }), false);
		Assert.assertEquals(arrayFront91(new int[] { 1, 2, 9, 4, 5 }), true);
		Assert.assertEquals(arrayFront91_v2(new int[] { 1, 2, 9, 4, 5 }), true);
		Assert.assertEquals(arrayFront91_v2(new int[] { 1, 2, 9, 4, 5 }), true);
		Assert.assertEquals(arrayFront91_v2(new int[] { 1, 2, 3 }), false);
		Assert.assertEquals(arrayFront91_v2(new int[] { 1, 2, 9 }), true);
		Assert.assertEquals(arrayFront91_v2(new int[] { 1, 2 }), false);
		Assert.assertEquals(arrayFront91_v2(new int[] { 1, 2, 4, 5, 7, 8, 6 }), false);

		Assert.assertEquals(arrayFront91_v3(new int[] { 1, 2, 9, 4, 5 }), true);
		Assert.assertEquals(arrayFront91_v3(new int[] { 1, 2, 9, 4, 5 }), true);
		Assert.assertEquals(arrayFront91_v3(new int[] { 1, 2, 3 }), false);
		Assert.assertEquals(arrayFront91_v3(new int[] { 1, 2, 9 }), true);
		Assert.assertEquals(arrayFront91_v3(new int[] { 1, 2 }), false);
		Assert.assertEquals(arrayFront91_v3(new int[] { 1, 2, 4, 5, 7, 8, 6 }), false);

	}

	/*
	 * Given a string, return true if the first instance of "x" in the string is
	 * immediately followed by another "x".
	 * 
	 * 
	 * doubleX("axxbb") → true doubleX("axaxax") → false doubleX("xxxxx") → true
	 */

	boolean doubleX_v1(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'x') {
				if (str.substring(i, i + 2).equals("xx")) {
					return true;
				} else
					return false;
			}

		}
		return false;

	}

	boolean doubleX(String str) {

		int xpos = str.indexOf('x');

		return xpos >= 0 && xpos <= str.length() - 2 && str.substring(xpos, xpos + 2).equals("xx") ? true : false;

	}

	@Test
	public void doubleXtest() {
		Assert.assertEquals(doubleX("axxbb"), true);
		Assert.assertEquals(doubleX("axaxax"), false);
		Assert.assertEquals(doubleX("xxxxx"), true);
		Assert.assertEquals(doubleX("xaxxx"), false);
		Assert.assertEquals(doubleX(""), false);
		Assert.assertEquals(doubleX("aaaax"), false);

	}

	/*
	 * Given a string, return the count of the number of times that a substring
	 * length 2 appears in the string and also as the last 2 chars of the string, so
	 * "hixxxhi" yields 1 (we won't count the end substring).
	 * 
	 * 
	 * last2("hixxhi") → 1 last2("xaxxaxaxx") → 1 last2("axxxaaxx") → 2
	 */
	public int last2(String str) {

		String last2string = str.length() > 2 ? str.substring(str.length() - 2) : "";
		if (last2string.length() == 0)
			return 0;
		String newstring = str.substring(0, str.length() - 1);

		int count = 0;
		int fromIndex = 0;
		while (true) {
			int i = newstring.indexOf(last2string, fromIndex);
			if (i == -1)
				break;
			fromIndex = i + 1;
			count++;
		}
		return count;
	}

	public int last2_v2(String str) {

		if (str.length() > 2) {
			String last2string = str.substring(str.length() - 2);
			String newstring = str.substring(0, str.length() - 1);

			int count = 0;
			int fromIndex = 0;
			while (true) {
				int i = newstring.indexOf(last2string, fromIndex);
				if (i == -1)
					break;
				fromIndex = i + 1;
				count++;
			}
			return count;
		} else
			return 0;
	}

	@Test
	public void last2test() {
		Assert.assertEquals(last2("hixxhi"), 1);
		Assert.assertEquals(last2("xaxxaxaxx"), 1);
		Assert.assertEquals(last2("axxxaaxx"), 2);
		Assert.assertEquals(last2("13121312"), 1);
		Assert.assertEquals(last2("h"), 0);
		Assert.assertEquals(last2("xxxx"), 2);

	}

	/*
	 * Given 2 strings, a and b, return the number of the positions where they
	 * contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3,
	 * since the "xx", "aa", and "az" substrings appear in the same place in both
	 * strings.
	 * 
	 * 
	 * stringMatch("xxcaazz", "xxbaaz") → 3 stringMatch("abc", "abc") → 2
	 * stringMatch("abc", "axc") → 0
	 */

	public int stringMatch(String a, String b) {

		int s1 = a.length();
		int s2 = b.length();
		int s = s1 > s2 ? s2 : s1;
		int count = 0;
		for (int i = 0; i < s - 1; i++) {
			if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
				count++;
			}
		}

		return count;
	}

	@Test
	public void stringMatchtest() {
		Assert.assertEquals(stringMatch("xxcaazz", "xxbaaz"), 3);
		Assert.assertEquals(stringMatch("abc", "abc"), 2);

	}

	/*
	 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
	 * ... so "kittens" yields "kien".
	 * 
	 * 
	 * altPairs("kitten") → "kien" altPairs("Chocolate") → "Chole"
	 * altPairs("CodingHorror") → "Congrr"
	 */
	public String altPairs_v0(String str) {

		String empty = "";
		int len = str.length();
		int index[] = { 0, 1, 4, 5, 8, 9 };

		for (int i = 0; i < index.length; i++) {
			if (index[i] < len) {
				empty += str.charAt(index[i]);
				System.out.println(index[i]);
			}
		}

		return empty;
	}

	public String altPairs(String str) {
		System.out.println(str);
		int arr[] = IntStream.range(0, str.length()).filter(x -> (x % 4 == 0) || (x % 4 == 1)).boxed()
				.mapToInt(Integer::new).toArray();
		for (int i : arr)
			System.out.print(i + " ");

		// 1,5,9
		// 4i+1

		int index[] = arr;
		int len = str.length();
		String empty = "";

		for (int i = 0; i < index.length; i++) {
			if (index[i] < len) {
				empty += str.charAt(index[i]);
				System.out.println(index[i]);
			}
		}

		return empty;
	}

	/*
	 * Length Index Limit Series 1 Series 1 - length Series 2 Series 2 - Length 12
	 * 11 0,4,8 3 1,5,9 3 13 12 0,4,8 3 1,5,9 3 14 13 0,4,8,12 4 1,5,9 3 15 14
	 * 0,4,8,12 4 1,5,9,13 4 16 15 0,4,8,12 4 1,5,9,13 4 17 16 0,4,8,12,16 5
	 * 1,5,9,13 4 18 17 0,4,8,12,16 5 1,5,9,13,17 4
	 */

	public String altPairs_failed(String str) {
		int len = str.length();

		String empty = "";
		int arr[] = new int[(len + 1) / 2];

		// 0,4,8,12
		// 4i
		System.out.println(str);
		for (int i = 0, ctr = 0; i < (len + 1) / 4; i++) {
			arr[ctr] = 4 * i;
			ctr++;
			arr[ctr] = 4 * i + 1;
			ctr++;

		}

		for (int i : arr)
			System.out.print(i + " ");

		// 1,5,9
		// 4i+1

		int index[] = arr;

		for (int i = 0; i < index.length; i++) {
			if (index[i] < len) {
				empty += str.charAt(index[i]);
				System.out.println(index[i]);
			}
		}

		return empty;
	}

	public String altPairs_v2(String str) {
		int len = str.length();

		String empty = "";
		int arr[] = new int[(len + 1) / 2 + 4];

		// 0,4,8,12
		// 4i
		System.out.println(str);
		for (int i = 0, ctr = 0; i <= (len + 1) / 4; i++) {
			arr[ctr] = 4 * i;
			ctr++;
			arr[ctr] = 4 * i + 1;
			ctr++;

		}

		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
		int ctr = arr.length - 1;
		while (true) {
			if (arr[ctr] == 0) {
				arr[ctr] = str.length() + 1;
				ctr--;
			} else
				break;

		}
		for (int i : arr)
			System.out.print(i + " ");

		// 1,5,9
		// 4i+1

		int index[] = arr;

		for (int i = 0; i < index.length; i++) {
			if (index[i] < len) {
				empty += str.charAt(index[i]);
				System.out.println(index[i]);
			}
		}

		return empty;
	}

	@Test
	public void altPairstest() {
		Assert.assertEquals(altPairs("kitten"), "kien");
		Assert.assertEquals(altPairs("ThisThatTheOther"), "ThThThth");
		Assert.assertEquals(altPairs("Chocolate"), "Chole");
		Assert.assertEquals(altPairs("CodingHorror"), "Congrr");

	}

	/*
	 * Suppose the string "yak" is unlucky. Given a string, return a version where
	 * all the "yak" are removed, but the "a" can be any char. The "yak" strings
	 * will not overlap.
	 * 
	 * 
	 * stringYak("yakpak") → "pak" stringYak("pakyak") → "pak" stringYak("yak123ya")
	 * → "123ya"
	 */

	public String stringYak(String str) {

		int len = str.length();
		String result = "";

		for (int i = 0; i < len; i++) {

			if (i + 2 < str.length() && str.substring(i, i + 3).equals("yak")) {
				i = i + 2;
			} else
				result = result + str.charAt(i);
		}
		return result;
	}

	@Test
	public void stringYaktest() {
		Assert.assertEquals(stringYak("yakpak"), "pak");
		Assert.assertEquals(stringYak("pakyak"), "pak");
		Assert.assertEquals(stringYak("yak123ya"), "123ya");
		Assert.assertEquals(stringYak("yakpakymk"), "pakymk");

	}

	/*
	 * Given an array of ints, return the number of times that two 6's are next to
	 * each other in the array. Also count instances where the second "6" is
	 * actually a 7.
	 * 
	 * 
	 * array667([6, 6, 2]) → 1 array667([6, 6, 2, 6]) → 1 array667([6, 7, 2, 6]) → 1
	 */

	public int array667(int[] nums) {
		int count = 0;
		for (int i = 0; i < (nums.length - 1); i++) {
			if (nums[i] == 6) {
				if (nums[i + 1] == 6 || nums[i + 1] == 7)
					count++;
			}
		}

		return count;
	}

	@Test
	public void array667test() {
		Assert.assertEquals(array667(new int[] { 6, 6, 2 }), 1);
		Assert.assertEquals(array667(new int[] { 6, 7, 6, 6 }), 2);

		Assert.assertEquals(array667(new int[] {}), 0);
		Assert.assertEquals(array667(new int[] { 6, 1 }), 0);

		Assert.assertEquals(array667(new int[] { 1, 2, 3, 6, 6 }), 1);

	}

	/*
	 * Given an array of ints, we'll say that a triple is a value appearing 3 times
	 * in a row in the array. Return true if the array does not contain any triples.
	 * 
	 * 
	 * noTriples([1, 1, 2, 2, 1]) → true noTriples([1, 1, 2, 2, 2, 1]) → false
	 * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
	 */

	public boolean noTriples1(int[] nums) {

		for (int i = 0; i < (nums.length - 2); i++) {
			int first = nums[i];
			if (nums[i + 1] == first && nums[i + 2] == first) {
				return false;
			}
		}

		return true;
	}

	@Test
	public void noTriplestest() {
		Assert.assertEquals(noTriples(new int[] { 1, 1, 2, 2, 1 }), true);
		Assert.assertEquals(noTriples(new int[] { 1, 1, 2, 2, 2, 1 }), false);
		Assert.assertEquals(noTriples(new int[] { 1, 1, 1, 2, 2, 2, 1 }), false);
		Assert.assertEquals(noTriples(new int[] { 1, 1, 2, 2, 1 }), true);
		Assert.assertEquals(noTriples(new int[] { 1, 1, 2, 2, 1 }), true);

	}

	/*
	 * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a
	 * value, followed by the value plus 5, followed by the value minus 1.
	 * Additionally the 271 counts even if the "1" differs by 2 or less from the
	 * correct value.
	 * 
	 * 
	 * has271([1, 2, 7, 1]) → true has271([1, 2, 8, 1]) → false has271([2, 7, 1]) →
	 * true
	 */

	public boolean has271(int[] nums) {

		for (int i = 0; i < (nums.length - 2); i++) {
			int val = nums[i];

			if (nums[i + 1] == (val + 5) && Math.abs(nums[i + 2] - (val - 1)) <= 2)
				return true;
		}

		return false;
	}

	@Test
	public void has271test() {
		Assert.assertEquals(has271(new int[] { 1, 2, 7, 1 }), true);
		Assert.assertEquals(has271(new int[] { 1, 2, 8, 1 }), false);

		Assert.assertEquals(has271(new int[] { 2, 7, 1 }), true);
		Assert.assertEquals(has271(new int[] { 1, 2, 7, 1 }), true);

	}

}
