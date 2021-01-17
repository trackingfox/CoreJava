package com.codingbat;

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

//	@Test
//	public void rotateLeft3test() {
//		Assert.assertEquals(rotateLeft3(new int[] {1,2,3 }), {3,2,1});
//		Assert.assertEquals(rotateLeft3(new int[] { 5,11,9 }), {9,11,5});
//		Assert.assertEquals(rotateLeft3(new int[] { 7,0,0}), {0,0,7});
//		Assert.assertEquals(rotateLeft3(new int[] { 1,2,3 }), {3,2,1});
//
//	}

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

//	@Test
//	public void reverse3test() {
//		Assert.assertEquals(reverse3(new int[] {1,2,3 }), {3,2,1});
//		Assert.assertEquals(rotateLeft3(new int[] { 5,11,9 }), {9,11,5});
//		Assert.assertEquals(rotateLeft3(new int[] { 7,0,0}), {0,0,7});
//		
//	}

	/*
	 * Given an array of ints length 3, figure out which is larger, the first or
	 * last element in the array, and set all the other elements to be that value.
	 * Return the changed array.
	 * 
	 * 
	 * maxEnd3([1, 2, 3]) → [3, 3, 3] maxEnd3([11, 5, 9]) → [11, 11, 11] maxEnd3([2,
	 * 11, 3]) → [3, 3, 3]
	 */

	public int[] maxEnd3(int[] nums) {

		int len = nums.length;
		int[] arr = new int[len];

		for (int i = 0; i < len; i++) {
			if (nums[0] >= nums[len - 1]) {
				arr[i] = nums[0];
			} else
				arr[i] = nums[len - 1];
		}

		return arr;
	}

	/*
	 * Given an array of ints, return the sum of the first 2 elements in the array.
	 * If the array length is less than 2, just sum up the elements that exist,
	 * returning 0 if the array is length 0.
	 * 
	 * 
	 * sum2([1, 2, 3]) → 3 sum2([1, 1]) → 2 sum2([1, 1, 1, 1]) → 2
	 */

	public int sum2(int[] nums) {

		if (nums.length == 1)
			return nums[0];

		if (nums.length >= 1)
			return nums[0] + nums[1];

		return 0;
	}

	/*
	 * Given 2 int arrays, a and b, each length 3, return a new array length 2
	 * containing their middle elements.
	 * 
	 * 
	 * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5] middleWay([7, 7, 7], [3, 8, 0]) →
	 * [7, 8]
	 *
	 * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
	 */

	public int[] middleWay(int[] a, int[] b) {

		int len = a.length;
		int[] arr = new int[2];
		arr[0] = a[(len - 1) / 2];
		arr[1] = b[(len - 1) / 2];
		return arr;

	}

	/*
	 * Given an array of ints, return a new array length 2 containing the first and
	 * last elements from the original array. The original array will be length 1 or
	 * more.
	 * 
	 * 
	 * makeEnds([1, 2, 3]) → [1, 3] makeEnds([1, 2, 3, 4]) → [1, 4] makeEnds([7, 4,
	 * 6, 2]) → [7, 2]
	 */

	public int[] makeEnds(int[] nums) {

		int len = nums.length;
		int[] arr = new int[2];
		if (len > 1) {
			arr[0] = nums[0];
			arr[1] = nums[(len - 1)];
			return arr;
		}
		if (len == 1) {
			arr[0] = nums[0];
			return arr;
		}

		return arr;

	}

	/*
	 * Given an int array length 2, return true if it contains a 2 or a 3.
	 * 
	 * 
	 * has23([2, 5]) → true has23([4, 3]) → true has23([4, 5]) → false
	 */

	public boolean has23(int[] nums) {

		return false;

	}

	/*
	 * Given an int array, return a new array with double the length where its last
	 * element is the same as the original array, and all the other elements are 0.
	 * The original array will be length 1 or more. Note: by default, a new int
	 * array contains all 0's.
	 * 
	 * 
	 * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6] makeLast([1, 2]) → [0, 0, 0, 2]
	 * makeLast([3]) → [0, 3]
	 */

	public int[] makeLast(int[] nums) {

		int len = nums.length;
		int[] arr = new int[2 * len];

		arr[2 * len - 1] = nums[len - 1];
		for (int i = 0; i < 2 * len - 1; i++) {

			arr[i] = 0;
		}

		return arr;
	}

	/*
	 * Given an int array, return true if the array contains 2 twice, or 3 twice.
	 * The array will be length 0, 1, or 2.
	 * 
	 * 
	 * double23([2, 2]) → true double23([3, 3]) → true double23([2, 3]) → false
	 */

	// List<Integer> list3 = Arrays.asList(myIntegerArray)
}
