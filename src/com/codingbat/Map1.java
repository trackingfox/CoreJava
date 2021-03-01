package com.codingbat;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	/*
	 * Modify and return the given map as follows: if the key "a" has a value, set
	 * the key "b" to have that value, and set the key "a" to have the value "".
	 * Basically "b" is a bully, taking the value and replacing it with the empty
	 * string.
	 * 
	 * 
	 * mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
	 * mapBully({"a": "candy"}) → {"a": "", "b": "candy"} mapBully({"a": "candy",
	 * "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
	 * 
	 * 
	 */

	public Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}

	/*
	 * Modify and return the given map as follows: if the key "a" has a value, set
	 * the key "b" to have that same value. In all cases remove the key "c", leaving
	 * the rest of the map unchanged.
	 * 
	 * 
	 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
	 * mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"} mapShare({"a": "aaa", "c":
	 * "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
	 * 
	 */
	public Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));

		}
		map.remove("c");

		return map;

	}
	/*
	 * Modify and return the given map as follows: for this problem the map may or
	 * may not contain the "a" and "b" keys. If both keys are present, append their
	 * 2 string values together and store the result under the key "ab".
	 * 
	 * 
	 * mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
	 * mapAB({"a": "Hi"}) → {"a": "Hi"} mapAB({"b": "There"}) → {"b": "There"}
	 */

	public Map<String, String> mapAB(Map<String, String> map) {

		if (map.containsKey("a") && map.containsKey("b")) {
			String ab = map.get("a") + map.get("b");
			map.put("ab", ab);
		}

		return map;

	}
	/*
	 * Given a map of food keys and topping values, modify and return the map as
	 * follows: if the key "ice cream" is present, set its value to "cherry". In all
	 * cases, set the key "bread" to have the value "butter".
	 * 
	 * 
	 * topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream":
	 * "cherry"} topping1({}) → {"bread": "butter"} topping1({"pancake": "syrup"}) →
	 * {"bread": "butter", "pancake": "syrup"}
	 */

	public Map<String, String> topping1(Map<String, String> map) {

		if (map.containsKey("ice cream")) {
			// String ab = map.get("a") + map.get("b");
			map.put("ice cream", "cherry");
		}
		map.put("bread", "butter");

		return map;

	}

	/*
	 * Given a map of food keys and their topping values, modify and return the map
	 * as follows: if the key "ice cream" has a value, set that as the value for the
	 * key "yogurt" also. If the key "spinach" has a value, change that value to
	 * "nuts".
	 * 
	 * 
	 * topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream":
	 * "cherry"} topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt":
	 * "cherry", "spinach": "nuts", "ice cream": "cherry"} topping2({"yogurt":
	 * "salt"}) → {"yogurt": "salt"}
	 */

	public Map<String, String> topping2(Map<String, String> map) {

		String yog = "yogurt";
		if (map.containsKey("ice cream")) {

			map.put(yog, map.get("ice cream"));
		}
		if (map.containsKey("spinach")) {

			map.put("spinach", "nuts");
		}
		return map;

	}

	/*
	 * Given a map of food keys and topping values, modify and return the map as
	 * follows: if the key "potato" has a value, set that as the value for the key
	 * "fries". If the key "salad" has a value, set that as the value for the key
	 * "spinach".
	 * 
	 * 
	 * topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
	 * topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
	 * topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad":
	 * "oil", "potato": "ketchup", "fries": "ketchup"}
	 */
	public Map<String, String> topping3(Map<String, String> map) {

		if (map.containsKey("potato")) {

			map.put("fries", map.get("potato"));
		}
		if (map.containsKey("salad")) {

			map.put("spinach", map.get("salad"));
		}
		return map;

	}
	/*
	 * Modify and return the given map as follows: if the keys "a" and "b" are both
	 * in the map and have equal values, remove them both.
	 * 
	 * 
	 * mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"} mapAB2({"a":
	 * "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"} mapAB2({"a": "aaa", "b":
	 * "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
	 */

	public Map<String, String> mapAB2(Map<String, String> map) {

		if (map.containsKey("a") && map.containsKey("b")) {
			if (map.get("a").equals(map.get("b"))) {
				map.remove("a");
				map.remove("b");
			}
		}
		return map;

	}

	/*
	 * Modify and return the given map as follows: if exactly one of the keys "a" or
	 * "b" has a value in the map (but not both), set the other to have that same
	 * value in the map.
	 * 
	 * 
	 * mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}
	 * mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}
	 * mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c":
	 * "cake"}
	 */

	public Map<String, String> mapAB3(Map<String, String> map) {

		if (map.containsKey("a") && !map.containsKey("b")) {
			map.put("b", map.get("a"));
		}
		if (map.containsKey("b") && !map.containsKey("a")) {
			map.put("a", map.get("b"));
		}

		return map;

	}

	/*
	 * Modify and return the given map as follows: if the keys "a" and "b" have
	 * values that have different lengths, then set "c" to have the longer value. If
	 * the values exist and have the same length, change them both to the empty
	 * string in the map.
	 * 
	 * 
	 * mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c":
	 * "aaa"} mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb",
	 * "c": "bbb"} mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c":
	 * "bbb"}
	 */

	public Map<String, String> mapAB4(Map<String, String> map) {

		if (map.containsKey("a") && map.containsKey("b")) {
			int lenA = map.get("a").length();
			int lenB = map.get("b").length();

			if (lenA > lenB)
				map.put("c", map.get("a"));
			if (lenB > lenA)
				map.put("c", map.get("b"));
			if (lenA == lenB) {
				map.put("a", "");
				map.put("b", "");
			}

		}
		return map;
	}

	/*
	 * Given an array of strings, return a Map<String, Integer> containing a key for
	 * every different string in the array, always with the value 0. For example the
	 * string "hello" makes the pair "hello":0. We'll do more complicated counting
	 * later, but for this problem the value is simply 0.
	 * 
	 * 
	 * word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0} word0(["a", "b", "a", "c",
	 * "b"]) → {"a": 0, "b": 0, "c": 0} word0(["c", "b", "a"]) → {"a": 0, "b": 0,
	 * "c": 0}
	 */

	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap();
		for (String s : strings) {
			map.put(s, 0);
		}
		return map;
	}

	/*
	 * Given an array of strings, return a Map<String, Integer> containing a key for
	 * every different string in the array, and the value is that string's length.
	 * 
	 * 
	 * wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1} wordLen(["this", "and",
	 * "that", "and"]) → {"that": 4, "and": 3, "this": 4} wordLen(["code", "code",
	 * "code", "bug"]) → {"code": 4, "bug": 3}
	 */

	public Map<String, Integer> wordLen(String[] strings) {

		Map<String, Integer> map = new HashMap();
		for (String s : strings)
			map.put(s, s.length());

		return map;
	}

	/*
	 * Given an array of non-empty strings, create and return a Map<String, String>
	 * as follows: for each string add its first character as a key with its last
	 * character as the value.
	 * 
	 * 
	 * pairs(["code", "bug"]) → {"b": "g", "c": "e"} pairs(["man", "moon", "main"])
	 * → {"m": "n"} pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n",
	 * "n": "t"}
	 */

	public Map<String, String> pairs(String[] strings) {

		Map<String, String> map = new HashMap();
		for (String s : strings)
			map.put(s.substring(0, 1), s.substring(s.length() - 1));

		return map;

	}

	/*
	 * The classic word-count algorithm: given an array of strings, return a
	 * Map<String, Integer> with a key for each different string, with the value the
	 * number of times that string appears in the array.
	 * 
	 * 
	 * wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
	 * wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1} wordCount(["c", "c",
	 * "c", "c"]) → {"c": 4}
	 */
//SOLUTION 1
	public Map<String, Integer> wordCount(String[] strings) {

		Map<String, Integer> mp = new HashMap<>();
		int n = strings.length;

		for (int i = 0; i < n; i++) {
			if (mp.containsKey(strings[i])) {
				mp.put(strings[i], mp.get(strings[i]) + 1);
			}

			else {
				mp.put(strings[i], 1);
			}
		}
		return mp;
	}

//SOLUTION 2
	public void countFreq(int arr[], int n) {
		Map<Integer, Integer> mp = new HashMap<>();

		// Traverse through array elements and
		// count frequencies
		for (int i = 0; i < n; i++) {
			if (mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i]) + 1);
			} else {
				mp.put(arr[i], 1);
			}
		}
		// Traverse through map and print frequencies
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	/*
	 * Given an array of non-empty strings, return a Map<String, String> with a key
	 * for every different first character seen, with the value of all the strings
	 * starting with that character appended together in the order they appear in
	 * the array.
	 * 
	 * 
	 * firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t":
	 * "teatoast"} firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA",
	 * "b": "bb", "c": "cccCC", "d": "d"} firstChar([]) → {}
	 */

	public Map<String, String> firstChar(String[] strings) {

		Map<String, String> map = new HashMap<String, String>();
		for (String s : strings) {
			if (!map.containsKey(s.substring(0, 1))) { // first time we've seen this string
				map.put(s.substring(0, 1), s);

			} else {
				String existing = map.get(s.substring(0, 1));
				map.put(s.substring(0, 1), existing + s);
			}

		}
		return map;

	}

	/*
	 * Loop over the given array of strings to build a result string like this: when
	 * a string appears the 2nd, 4th, 6th, etc. time in the array, append the string
	 * to the result. Return the empty string if no string appears a 2nd time.
	 * 
	 * 
	 * wordAppend(["a", "b", "a"]) → "a" wordAppend(["a", "b", "a", "c", "a", "d",
	 * "a"]) → "aa" wordAppend(["a", "", "a"]) → "a"
	 */

	public String wordAppend(String[] strings) {
		String result = "";
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String currentString : strings) {
			int i = 0;
			if (map.containsKey(currentString)) {
				i = map.get(currentString) + 1;
				map.put(currentString, i);
				if (i % 2 == 0) {
					result = result + currentString;
				}
			} else {
				map.put(currentString, i + 1);
			}

		}

		return result;
	}

	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different
	 * string is a key and its value is true if that string appears 2 or more times
	 * in the array.
	 * 
	 * 
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
	 * wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 */

	public Map<String, Boolean> wordMultiple(String[] strings) {
		String result = "";
		Map<String, Boolean> map = new HashMap<String, Boolean>();

		for (String currentString : strings) {

			if (map.containsKey(currentString)) {

				map.put(currentString, true);

			}

			else {
				map.put(currentString, false);
			}

		}

		return map;
	}

	/*
	 * We'll say that 2 strings "match" if they are non-empty and their first chars
	 * are the same. Loop over and then return the given array of non-empty strings
	 * as follows: if a string matches an earlier string in the array, swap the 2
	 * strings in the array. When a position in the array has been swapped, it no
	 * longer matches anything. Using a map, this can be solved making just one pass
	 * over the array. More difficult than it looks.
	 * 
	 * 
	 * allSwap(["ab", "ac"]) → ["ac", "ab"] allSwap(["ax", "bx", "cx", "cy", "by",
	 * "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
	 * allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by",
	 * "ax", "bx", "aj", "ai", "by", "bx"]
	 */

	public String[] allSwap(String[] strings) {
		String[] result = new String[strings.length];
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < strings.length; i++) {
			char c = strings[i].charAt(0);
			if (map.containsKey(c)) {
				int p = map.get(c);
				map.remove(c);

				result[i] = result[p];
				result[p] = strings[i];
			} else {
				result[i] = strings[i];
				map.put(c, i);
			}
		}
		return result;
	}

	/*
	 * We'll say that 2 strings "match" if they are non-empty and their first chars
	 * are the same. Loop over and then return the given array of non-empty strings
	 * as follows: if a string matches an earlier string in the array, swap the 2
	 * strings in the array. A particular first char can only cause 1 swap, so once
	 * a char has caused a swap, its later swaps are disabled. Using a map, this can
	 * be solved making just one pass over the array. More difficult than it looks.
	 * 
	 * 
	 * firstSwap(["ab", "ac"]) → ["ac", "ab"] firstSwap(["ax", "bx", "cx", "cy",
	 * "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "aaa",
	 * "azz"] firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay",
	 * "by", "ax", "bx", "ai", "aj", "bx", "by"]
	 */

	public String[] firstSwap(String[] strings) {
		Map<String, Integer> map = new HashMap();
		for (int i = 0; i < strings.length; i++) {
			String string = String.valueOf(strings[i].substring(0, 1));
			if (map.containsKey(string)) {
				int value = map.get(string);
				if (value == -1)
					continue;
				int pos = map.get(string);
				String temp = strings[pos];
				strings[pos] = strings[i];
				strings[i] = temp;
				map.put(string, -1);
			} else
				map.put(string, i);
		}
		return strings;
	}

	/*
	 * Given an array of ints, is it possible to choose a group of some of the ints,
	 * such that the group sums to the given target, with this additional
	 * constraint: if there are numbers in the array that are adjacent and the
	 * identical value, they must either all be chosen, or none of them chosen. For
	 * example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the
	 * middle must be chosen or not, all as a group. (one loop can be used to find
	 * the extent of the identical values).
	 * 
	 * 
	 * groupSumClump(0, [2, 4, 8], 10) → true groupSumClump(0, [1, 2, 4, 8, 1], 14)
	 * → true groupSumClump(0, [2, 4, 4, 8], 14) → false
	 */

	public boolean groupSumClump(int start, int[] nums, int target) {
		if (start >= nums.length) {
			if (target == 0)
				return true;
			return false;
		}
		int i = start + 1;
		for (; i < nums.length && nums[start] == nums[i]; i++)
			;
		if (groupSumClump(i, nums, target - ((i - start) * nums[start])))
			return true;
		return groupSumClump(i, nums, target);
	}

}
