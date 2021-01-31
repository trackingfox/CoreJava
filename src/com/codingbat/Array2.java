package com.codingbat;

public class Array2 {

	/*
	 * Return the sum of the numbers in the array, returning 0 for an empty array.
	 * Except the number 13 is very unlucky, so it does not count and numbers that
	 * come immediately after a 13 also do not count.
	 * 
	 * 
	 * sum13([1, 2, 2, 1]) → 6 sum13([1, 1]) → 2 sum13([1, 2, 2, 1, 13]) → 6
	 */

	public int sum13(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13)
				i++;
			else
				sum += nums[i];
		}
		return sum;
	}

	/*
	 * Return the sum of the numbers in the array, except ignore sections of numbers
	 * starting with a 6 and extending to the next 7 (every 6 will be followed by at
	 * least one 7). Return 0 for no numbers.
	 * 
	 * 
	 * sum67([1, 2, 2]) → 5 sum67([1, 2, 2, 6, 99, 99, 7]) → 5 sum67([1, 1, 6, 7,
	 * 2]) → 4
	 */

	public int sum67(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 6) {
				while (nums[i] != 7) {
					i++;
				}
			} else {
				sum = sum + nums[i];
			}
		}
		return sum;
	}

	/*
	 * Given an array of ints, return true if the array contains a 2 next to a 2
	 * somewhere.
	 * 
	 * 
	 * has22([1, 2, 2]) → true has22([1, 2, 1, 2]) → false has22([2, 1, 2]) → false
	 * 
	 */

	public boolean has22(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2)
				return true;
		}
		return false;
	}

	/*
	 * Given an array of ints, return true if the array contains no 1's and no 3's.
	 * 
	 * 
	 * lucky13([0, 2, 4]) → true lucky13([1, 2, 3]) → false lucky13([1, 2, 4]) →
	 * false
	 */

	public boolean lucky13(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 || nums[i] == 3)
				return false;
		}
		return true;
	}

	/*
	 * 
	 * Given an array of ints, return true if the sum of all the 2's in the array is
	 * exactly 8.
	 * 
	 * 
	 * sum28([2, 3, 2, 2, 4, 2]) → true sum28([2, 3, 2, 2, 4, 2, 2]) → false
	 * sum28([1, 2, 3, 4]) → false
	 */

	public boolean sum28(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2)
				sum += 2;
		}
		return (sum == 8);
	}

	/*
	 * Given an array of ints, return true if the number of 1's is greater than the
	 * number of 4's
	 * 
	 * 
	 * more14([1, 4, 1]) → true more14([1, 4, 1, 4]) → false more14([1, 1]) → true
	 */

	public boolean more14(int[] nums) {
		int balance = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1)
				balance++;
			else if (nums[i] == 4)
				balance--;
		}
		return (balance > 0);
	}

	/*
	 * 
	 * Given an array of ints, return true if every element is a 1 or a 4.
	 * 
	 * 
	 * only14([1, 4, 1, 4]) → true only14([1, 4, 2, 4]) → false only14([1, 1]) →
	 * true
	 * 
	 * 
	 */

	public boolean only14(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1 && nums[i] != 4)
				return false;
		}
		return true;
	}

	/*
	 * Given an array of ints, return true if it contains no 1's or it contains no
	 * 4's.
	 * 
	 * 
	 * no14([1, 2, 3]) → true no14([1, 2, 3, 4]) → false no14([2, 3, 4]) → true
	 * 
	 */
	public boolean no14(int[] nums) {
		boolean noOne = true, noFour = true;
		for (int i = 0; i < nums.length && (noOne || noFour); i++) {
			if (nums[i] == 1)
				noOne = false;
			else if (nums[i] == 4)
				noFour = false;
		}
		return (noOne || noFour);
	}

}
