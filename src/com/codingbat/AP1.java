package com.codingbat;

import java.util.ArrayList;
import java.util.List;

public class AP1 {

	/*
	 * Given an array of scores, return true if each score is equal or greater than
	 * the one before. The array will be length 2 or more.
	 * 
	 * 
	 * scoresIncreasing([1, 3, 4]) → true scoresIncreasing([1, 3, 2]) → false
	 * scoresIncreasing([1, 1, 4]) → true
	 */

	public boolean scoresIncreasing(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i + 1] < scores[i]) {
				return false;
			}
		}

		return true;
	}

	/*
	 * Given an array of scores, return true if there are scores of 100 next to each
	 * other in the array. The array length will be at least 2.
	 * 
	 * 
	 * scores100([1, 100, 100]) → true scores100([1, 100, 99, 100]) → false
	 * scores100([100, 1, 100, 100]) → true
	 */

	public boolean scores100(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] == 100 && scores[i + 1] == 100) {
				return true;
			}
		}

		return false;
	}

	/*
	 * Given an array of scores sorted in increasing order, return true if the array
	 * contains 3 adjacent scores that differ from each other by at most 2, such as
	 * with {3, 4, 5} or {3, 5, 5}.
	 * 
	 * 
	 * scoresClump([3, 4, 5]) → true scoresClump([3, 4, 6]) → false scoresClump([1,
	 * 3, 5, 5]) → true
	 */
	public boolean scoresClump(int[] scores) {
		for (int i = 0; i < scores.length - 2; i++) {
			if (scores[i + 2] - scores[i] <= 2) {
				return true;
			}
		}

		return false;
	}

	/*
	 * Given an array of strings, return the count of the number of strings with the
	 * given length.
	 * 
	 * 
	 * wordsCount(["a", "bb", "b", "ccc"], 1) → 2 wordsCount(["a", "bb", "b",
	 * "ccc"], 3) → 1 wordsCount(["a", "bb", "b", "ccc"], 4) → 0
	 */

	public int wordsCount(String[] words, int len) {
		int count = 0;

		for (String s : words) {
			if (s.length() == len) {
				count++;
			}
		}

		return count;
	}

	/*
	 * Given an array of strings, return a new array containing the first N strings.
	 * N will be in the range 1..length.
	 * 
	 * 
	 * wordsFront(["a", "b", "c", "d"], 1) → ["a"] wordsFront(["a", "b", "c", "d"],
	 * 2) → ["a", "b"] wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]
	 */

	public String[] wordsFront(String[] words, int n) {

		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			result[i] = words[i];
		}
		return result;

	}

	/*
	 * Given an array of strings, return a new List (e.g. an ArrayList) where all
	 * the strings of the given length are omitted. See wordsWithout() below which
	 * is more difficult because it uses arrays.
	 * 
	 * 
	 * wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
	 * wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
	 * wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
	 */
	public List wordsWithoutList(String[] words, int len) {

		List<String> newArr = new ArrayList<String>();

		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != len)
				newArr.add(words[i]);
		}

		return newArr;

	}

	/*
	 * Given an array of positive ints, return a new array of length "count"
	 * containing the first even numbers from the original array. The original array
	 * will contain at least "count" even numbers.
	 * 
	 * 
	 * copyEvens([3, 2, 4, 5, 8], 2) → [2, 4] copyEvens([3, 2, 4, 5, 8], 3) → [2, 4,
	 * 8] copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
	 * 
	 */

	public int[] copyEvens(int[] nums, int count) {
		int[] arr = new int[count];
		int index = 0;

		for (int i = 0; index < count; i++) {
			if (nums[i] % 2 == 0) {
				arr[index] = nums[i];
				index++;
			}
		}

		return arr;
	}

	/*
	 * We'll say that a positive int divides itself if every digit in the number
	 * divides into the number evenly. So for example 128 divides itself since 1, 2,
	 * and 8 all divide into 128 evenly. We'll say that 0 does not divide into
	 * anything evenly, so no number with a 0 digit divides itself. Note: use % to
	 * get the rightmost digit, and / to discard the rightmost digit.
	 * 
	 * 
	 * dividesSelf(128) → true dividesSelf(12) → true dividesSelf(120) → false
	 */

	public String[] wordsWithout(String[] words, String target) {

		int count = 0;

		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(target))
				count++;
		}

		String[] newArr = new String[count];

		int pos = 0;
		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(target))
				newArr[pos++] = words[i];
		}
		return newArr;
	}

	/*
	 * We have an array of heights, representing the altitude along a walking trail.
	 * Given start/end indexes into the array, return the sum of the changes for a
	 * walk beginning at the start index and ending at the end index. For example,
	 * with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 =
	 * 6. The start end end index will both be valid indexes into the array with
	 * start <= end.
	 * 
	 * 
	 * sumHeights([5, 3, 6, 7, 2], 2, 4) → 6 sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
	 * sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
	 */
	public int sumHeights(int[] heights, int start, int end) {
		int tmp = 0;
		for (int i = start; i <= end - 1; i++) {
			tmp += Math.abs(heights[i] - heights[i + 1]);
		}
		return tmp;
	}

	/*
	 * (A variation on the sumHeights problem.) We have an array of heights,
	 * representing the altitude along a walking trail. Given start/end indexes into
	 * the array, return the sum of the changes for a walk beginning at the start
	 * index and ending at the end index, however increases in height count double.
	 * For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum
	 * of 1*2 + 5 = 7. The start end end index will both be valid indexes into the
	 * array with start <= end.
	 * 
	 * 
	 * sumHeights2([5, 3, 6, 7, 2], 2, 4) → 7 sumHeights2([5, 3, 6, 7, 2], 0, 1) → 2
	 * sumHeights2([5, 3, 6, 7, 2], 0, 4) → 15
	 */

	public int sumHeights2(int[] heights, int start, int end) {
		int tmp = 0;
		for (int i = start; i <= end - 1; i++) {
			if (heights[i + 1] > heights[i])
				tmp += 2 * (Math.abs(heights[i] - heights[i + 1]));
			else
				tmp += Math.abs(heights[i] - heights[i + 1]);
		}
		return tmp;
	}

	/*
	 * We have data for two users, A and B, each with a String name and an int id.
	 * The goal is to order the users such as for sorting. Return -1 if A comes
	 * before B, 1 if A comes after B, and 0 if they are the same. Order first by
	 * the string names, and then by the id numbers if the names are the same. Note:
	 * with Strings str1.compareTo(str2) returns an int value which is
	 * negative/0/positive to indicate how str1 is ordered to str2 (the value is not
	 * limited to -1/0/1). (On the AP, there would be two User objects, but here the
	 * code simply takes the two strings and two ints directly. The code logic is
	 * the same.)
	 * 
	 * 
	 * userCompare("bb", 1, "zz", 2) → -1 userCompare("bb", 1, "aa", 2) → 1
	 * userCompare("bb", 1, "bb", 1) → 0
	 */

	public int userCompare(String aName, int aId, String bName, int bId) {
		if (aName.compareTo(bName) < 0)
			return -1;
		if (aName.equals(bName)) {
			if (aId == bId)
				return 0;
			if (aId < bId)
				return -1;
		}
		return 1;
	}

	/*
	 * Start with two arrays of strings, A and B, each with its elements in
	 * alphabetical order and without duplicates. Return a new array containing the
	 * first N elements from the two arrays. The result array should be in
	 * alphabetical order and without duplicates. A and B will both have a length
	 * which is N or more. The best "linear" solution makes a single pass over A and
	 * B, taking advantage of the fact that they are in alphabetical order, copying
	 * elements directly to the new array.
	 * 
	 * 
	 * mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
	 * mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
	 * mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
	 */

	public String[] mergeTwo(String[] a, String[] b, int n) {
		String[] result = new String[n];
		int indexResult = 0;
		int indexA = 0;
		int indexB = 0;

		while (indexResult < n)
			if (a[indexA].compareTo(b[indexB]) < 0)
				result[indexResult++] = a[indexA++];
			else if (a[indexA].compareTo(b[indexB]) > 0)
				result[indexResult++] = b[indexB++];
			else { // identical strings
				result[indexResult++] = a[indexA++];
				indexB++;
			}
		return result;
	}

	/*
	 * (A variation on the sumHeights problem.) We have an array of heights,
	 * representing the altitude along a walking trail. Given start/end indexes into
	 * the array, return the number of "big" steps for a walk starting at the start
	 * index and ending at the end index. We'll say that step is big if it is 5 or
	 * more up or down. The start end end index will both be valid indexes into the
	 * array with start <= end.
	 * 
	 * 
	 * bigHeights([5, 3, 6, 7, 2], 2, 4) → 1 bigHeights([5, 3, 6, 7, 2], 0, 1) → 0
	 * bigHeights([5, 3, 6, 7, 2], 0, 4) → 1
	 */

	public int bigHeights(int[] heights, int start, int end) {
		int count = 0;
		for (int i = start; i < end; i++)
			if (Math.abs(heights[i] - heights[i + 1]) >= 5)
				count++;
		return count;
	}

	/*
	 * Given two arrays, A and B, of non-negative int scores. A "special" score is
	 * one which is a multiple of 10, such as 40 or 90. Return the sum of largest
	 * special score in A and the largest special score in B. To practice
	 * decomposition, write a separate helper method which finds the largest special
	 * score in an array. Write your helper method after your scoresSpecial() method
	 * in the JavaBat text area.
	 * 
	 * 
	 * scoresSpecial([12, 10, 4], [2, 20, 30]) → 40 scoresSpecial([20, 10, 4], [2,
	 * 20, 10]) → 40 scoresSpecial([12, 11, 4], [2, 20, 31]) → 20
	 */

	public int scoresSpecial(int[] a, int[] b) {
		int resultA = 0;
		for (int anA : a) {
			if (anA % 10 == 0 && anA > resultA) {
				resultA = anA;
			}
		}

		int resultB = 0;
		for (int aB : b) {
			if (aB % 10 == 0 && aB > resultB) {
				resultB = aB;
			}
		}

		return resultA + resultB;
	}

	/*
	 * Start with two arrays of strings, a and b, each in alphabetical order,
	 * possibly with duplicates. Return the count of the number of strings which
	 * appear in both arrays. The best "linear" solution makes a single pass over
	 * both arrays, taking advantage of the fact that they are in alphabetical
	 * order.
	 * 
	 * 
	 * commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2 commonTwo(["a", "c",
	 * "x"], ["a", "b", "c", "x", "z"]) → 3 commonTwo(["a", "b", "c"], ["a", "b",
	 * "c"]) → 3
	 */

	public int commonTwo(String[] a, String[] b) {
		int count = 0;
		String lastChecked = null;
		for (String anA : a) {
			if (!anA.equals(lastChecked)) {
				for (String aB : b) {
					if (anA.equals(aB)) {
						count++;
						lastChecked = anA;
						break;
					}
				}
			}
		}
		return count;
	}

}
