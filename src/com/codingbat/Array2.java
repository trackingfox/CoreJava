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

}
