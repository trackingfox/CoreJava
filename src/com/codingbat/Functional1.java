package com.codingbat;

import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {

	/*
	 * Given a list of strings, return a list where each string has "y" added at its
	 * start and end.
	 * 
	 * 
	 * moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"] moreY(["hello", "there"]) →
	 * ["yhelloy", "ytherey"] moreY(["yay"]) → ["yyayy"]
	 */

	public List<String> moreY(List<String> strings) {
		strings.replaceAll(n -> "y" + n + "y");
		return strings;
	}

	public List<String> moreY1(List<String> strings) {
		return strings.stream().map(n -> "y" + n + "y").collect(Collectors.toList());

	}

	/*
	 * 
	 * Given a list of integers, return a list where each integer is added to 1 and
	 * the result is multiplied by 10.
	 * 
	 * 
	 * math1([1, 2, 3]) → [20, 30, 40] math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
	 * math1([10]) → [110]
	 */

	public List<Integer> math1(List<Integer> nums) {
		nums.replaceAll(n -> (1 + n) * 10);
		return nums;
	}

	public List<Integer> math2(List<Integer> nums) {
		return nums.stream().map(n -> (n + 1) * 10).collect(Collectors.toList());
	}

	/*
	 * Given a list of non-negative integers, return an integer list of the
	 * rightmost digits. (Note: use %)
	 * 
	 * 
	 * rightDigit([1, 22, 93]) → [1, 2, 3] rightDigit([16, 8, 886, 8, 1]) → [6, 8,
	 * 6, 8, 1] rightDigit([10, 0]) → [0, 0]
	 */

	public List<Integer> rightDigit(List<Integer> nums) {
		return nums.stream().map(n -> n % 10).collect(Collectors.toList());

	}

	/*
	 * Given a list of strings, return a list where each string is converted to
	 * lower case (Note: String toLowerCase() method).
	 * 
	 * 
	 * lower(["Hello", "Hi"]) → ["hello", "hi"] lower(["AAA", "BBB", "ccc"]) →
	 * ["aaa", "bbb", "ccc"] lower(["KitteN", "ChocolaTE"]) → ["kitten",
	 * "chocolate"]
	 */

	public List<String> lower(List<String> strings) {
		return strings.stream().map(n -> n.toLowerCase()).collect(Collectors.toList());
	}

	/*
	 * Given a list of strings, return a list where each string has all its "x"
	 * removed.
	 * 
	 * 
	 * noX(["ax", "bb", "cx"]) → ["a", "bb", "c"] noX(["xxax", "xbxbx", "xxcx"]) →
	 * ["a", "bb", "c"] noX(["x"]) → [""]
	 * 
	 */

	public List<String> noX(List<String> strings) {
		return strings.stream().map(n -> n.replace("x", "")).collect(Collectors.toList());

	}

	/*
	 * Given a list of integers, return a list of the integers, omitting any that
	 * are less than 0.
	 * 
	 * 
	 * noNeg([1, -2]) → [1] noNeg([-3, -3, 3, 3]) → [3, 3] noNeg([-1, -1, -1]) → []
	 */

	public List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(n -> n < 0);
		return nums;
	}

	public List<Integer> noNeg1(List<Integer> nums) {
		return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
	}

	/*
	 * Given a list of non-negative integers, return a list of those numbers except
	 * omitting any that end with 9. (Note: % by 10)
	 * 
	 * 
	 * no9([1, 2, 19]) → [1, 2] no9([9, 19, 29, 3]) → [3] no9([1, 2, 3]) → [1, 2, 3]
	 */

}
