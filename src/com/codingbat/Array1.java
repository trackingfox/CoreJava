package com.codingbat;

import org.junit.Test;

import junit.framework.Assert;

public class Array1 {

	/*
	 * Given an array of ints, return true if 6 appears as either the first or last
	 * element in the array. The array will be length 1 or more.
	 * 
	 * 
	 * firstLast6([1, 2, 6]) → true firstLast6([6, 1, 2, 3]) → true firstLast6([13,
	 * 6, 1, 2, 3]) → false
	 */

	public boolean firstLast6(int[] nums) {
		int len = nums.length;

		if (nums[0] == 6 || nums[len - 1] == 6)
			return true;
		else
			return false;

	}

	/*
	 * Given an array of ints, return true if the array is length 1 or more, and the
	 * first element and the last element are equal.
	 * 
	 * 
	 * sameFirstLast([1, 2, 3]) → false sameFirstLast([1, 2, 3, 1]) → true
	 * sameFirstLast([1, 2, 1]) → true
	 */

	public boolean sameFirstLast(int[] nums) {

		int len = nums.length;
		if (len > 0) {

			if (nums[0] == nums[len - 1])
				return true;
		} else
			return false;

		return false;

	}

	/*
	 * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
	 * 
	 * 
	 * makePi() → [3, 1, 4]
	 */

	public int[] makePi() {

		return null;

	}

	/*
	 * Given 2 arrays of ints, a and b, return true if they have the same first
	 * element or they have the same last element. Both arrays will be length 1 or
	 * more.
	 * 
	 * 
	 * commonEnd([1, 2, 3], [7, 3]) → true commonEnd([1, 2, 3], [7, 3, 2]) → false
	 * commonEnd([1, 2, 3], [1, 3]) → true
	 */

	public boolean commonEnd(int[] a, int[] b) {

		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		}

		else
			return false;

	}

	/*
	 * Given an array of ints length 3, return the sum of all the elements.
	 * 
	 * 
	 * sum3([1, 2, 3]) → 6 sum3([5, 11, 2]) → 18 sum3([7, 0, 0]) → 7
	 */

	public int sum3(int[] nums) {

		int sum = 0;
		for (int i = 0; i < nums.length; i++)
			sum = sum + nums[i];

		return sum;

	}

	/*
	 * Given an array of ints length 3, return an array with the elements
	 * "rotated left" so {1, 2, 3} yields {2, 3, 1}.
	 * 
	 * 
	 * rotateLeft3([1, 2, 3]) → [2, 3, 1] rotateLeft3([5, 11, 9]) → [11, 9, 5]
	 * rotateLeft3([7, 0, 0]) → [0, 0, 7]
	 */

	public int[] rotateLeft3(int[] nums) {

		int n = nums.length;
		int[] rotArray = new int[n];

		for (int oldIndex = 0; oldIndex < n; oldIndex++) {
			int newIndex = (oldIndex + n - 1) % n;
			rotArray[newIndex] = nums[oldIndex];
		}

		return rotArray;

	}

	@Test
	public void rotateLeft3test() {
		Assert.assertEquals(rotateLeft3(new int[] {1,2,3 }), {3,2,1});
		Assert.assertEquals(rotateLeft3(new int[] { 5,11,9 }), {9,11,5});
		Assert.assertEquals(rotateLeft3(new int[] { 7,0,0}), {0,0,7});
		Assert.assertEquals(rotateLeft3(new int[] { 1,2,3 }), {3,2,1});

	}

	/*
	 * Given an array of ints length 3, return a new array with the elements in
	 * reverse order, so {1, 2, 3} becomes {3, 2, 1}.
	 * 
	 * 
	 * reverse3([1, 2, 3]) → [3, 2, 1] reverse3([5, 11, 9]) → [9, 11, 5]
	 * reverse3([7, 0, 0]) → [0, 0, 7]
	 */

	public int[] reverse3(int[] nums) {
		int n = nums.length;
		int[] arr = new int[n];
		int j = 0;

		for (int i = nums.length - 1; i >= 0; i--) {
			arr[j++] = nums[i];
		}
		return arr;

	}

	@Test
	public void reverse3test() {
		Assert.assertEquals(reverse3(new int[] {1,2,3 }), {3,2,1});
		Assert.assertEquals(rotateLeft3(new int[] { 5,11,9 }), {9,11,5});
		Assert.assertEquals(rotateLeft3(new int[] { 7,0,0}), {0,0,7});
		
	}
}
