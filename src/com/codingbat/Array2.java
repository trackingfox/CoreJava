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

	/*
	 * We'll say that a value is "everywhere" in an array if for every pair of
	 * adjacent elements in the array, at least one of the pair is that value.
	 * Return true if the given value is everywhere in the array.
	 * 
	 * 
	 * isEverywhere([1, 2, 1, 3], 1) → true isEverywhere([1, 2, 1, 3], 2) → false
	 * isEverywhere([1, 2, 1, 3, 4], 1) → false
	 */

	public boolean isEverywhere(int[] nums, int val) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != val && nums[i + 1] != val)
				return false;
		}
		return true;
	}

	/*
	 * Given an array of ints, return true if the array contains a 2 next to a 2 or
	 * a 4 next to a 4, but not both.
	 * 
	 * 
	 * either24([1, 2, 2]) → true either24([4, 4, 1]) → true either24([4, 4, 1, 2,
	 * 2]) → false
	 */

	public boolean either24(int[] nums) {
		int no2pair = 1, no4pair = 1;
		for (int i = 0; i < nums.length - 1 && (no2pair + no4pair != 0); i++) {
			if (nums[i] == 2 && nums[i + 1] == 2)
				no2pair = 0;
			else if (nums[i] == 4 && nums[i + 1] == 4)
				no4pair = 0;
		}
		return ((no2pair ^ no4pair) == 1);
	}

	/*
	 * Given arrays nums1 and nums2 of the same length, for every element in nums1,
	 * consider the corresponding element in nums2 (at the same index). Return the
	 * count of the number of times that the two elements differ by 2 or less, but
	 * are not equal.
	 * 
	 * 
	 * matchUp([1, 2, 3], [2, 3, 10]) → 2 matchUp([1, 2, 3], [2, 3, 5]) → 3
	 * matchUp([1, 2, 3], [2, 3, 3]) → 2
	 * 
	 */
	public int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		int diff;
		for (int i = 0; i < nums1.length; i++) {
			diff = Math.abs(nums1[i] - nums2[i]);
			if (diff <= 2 && diff != 0)
				count++;
		}
		return count;
	}

	/*
	 * Given an array of ints, return true if the array contains two 7's next to
	 * each other, or there are two 7's separated by one element, such as with {7,
	 * 1, 7}.
	 * 
	 * 
	 * has77([1, 7, 7]) → true has77([1, 7, 1, 7]) → true has77([1, 7, 1, 1, 7]) →
	 * false
	 */

	public boolean has77(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 7) {
				if (nums[i + 1] == 7)
					return true;
				else if (i < nums.length - 2 && nums[i + 2] == 7)
					return true;
			}
		}
		return false;
	}

	/*
	 * Given an array of ints, return true if there is a 1 in the array with a 2
	 * somewhere later in the array.
	 * 
	 * 
	 * has12([1, 3, 2]) → true has12([3, 1, 2]) → true has12([3, 1, 4, 5, 2]) → true
	 */

	public boolean has12(int[] nums) {
		boolean oneSpotted = false;
		for (int i = 0; i < nums.length; i++) {
			if (oneSpotted) {
				if (nums[i] == 2)
					return true;
			} else if (nums[i] == 1)
				oneSpotted = true;
		}
		return false;
	}

	/*
	 * Given an array of ints, return true if the array contains either 3 even or 3
	 * odd values all next to each other.
	 * 
	 * 
	 * modThree([2, 1, 3, 5]) → true modThree([2, 1, 2, 5]) → false modThree([2, 4,
	 * 2, 5]) → true
	 */
	public boolean modThree(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] % 2 == nums[i + 1] % 2 && nums[i] % 2 == nums[i + 2] % 2)
				return true;
		}
		return false;
	}

	/*
	 * Given an array of ints, return true if the value 3 appears in the array
	 * exactly 3 times, and no 3's are next to each other.
	 * 
	 * 
	 * haveThree([3, 1, 3, 1, 3]) → true haveThree([3, 1, 3, 3]) → false
	 * haveThree([3, 4, 3, 3, 4]) → false
	 */

	public boolean haveThree(int[] nums) {
		int count = 0;
		boolean isPerv3 = false;
		for (int i = 0; i < nums.length && count <= 3; i++) {
			if (nums[i] == 3) {
				if (isPerv3)
					return false;
				else {
					count++;
					isPerv3 = true;
				}
			} else
				isPerv3 = false;
		}
		return (count == 3);
	}

	/*
	 * Given an array of ints, return true if every 2 that appears in the array is
	 * next to another 2.
	 * 
	 * 
	 * twoTwo([4, 2, 2, 3]) → true twoTwo([2, 2, 4]) → true twoTwo([2, 2, 4, 2]) →
	 * false
	 */

	public boolean twoTwo(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2)
				count++;
			else {
				if (count == 1)
					return false;
				else
					count = 0;
			}
		}
		return (count != 1);
	}

	/*
	 * Return true if the array contains, somewhere, three increasing adjacent
	 * numbers like .... 4, 5, 6, ... or 23, 24, 25.
	 * 
	 * 
	 * tripleUp([1, 4, 5, 6, 2]) → true tripleUp([1, 2, 3]) → true tripleUp([1, 2,
	 * 4]) → false
	 */

	public boolean tripleUp(int[] nums) {
		boolean prevUp = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] - nums[i] == 1) {
				if (prevUp)
					return true;
				else
					prevUp = true;
			} else
				prevUp = false;
		}
		return false;
	}

	/*
	 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2,
	 * 5, 3, 6}. You may modify and return the given array, or return a new array.
	 * 
	 * 
	 * shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6] shiftLeft([1, 2]) → [2, 1]
	 * shiftLeft([1]) → [1]
	 * 
	 */

	public int[] shiftLeft(int[] nums) {
		if (nums.length >= 2) {
			int temp = nums[0];
			for (int i = 0; i < nums.length - 1; i++)
				nums[i] = nums[i + 1];
			nums[nums.length - 1] = temp;
		}
		return nums;
	}

	/*
	 * For each multiple of 10 in the given array, change all the values following
	 * it to be that multiple of 10, until encountering another multiple of 10. So
	 * {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
	 * 
	 * 
	 * tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20] tenRun([10, 1, 20, 2])
	 * → [10, 10, 20, 20] tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
	 */

	public int[] tenRun(int[] nums) {
		int tenMode = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == 0)
				tenMode = nums[i];
			else if (tenMode != -1)
				nums[i] = tenMode;
		}
		return nums;
	}

	/*
	 * Given a non-empty array of ints, return a new array containing the elements
	 * from the original array that come before the first 4 in the original array.
	 * The original array will contain at least one 4. Note that it is valid in java
	 * to create an array of length 0.
	 * 
	 * 
	 * pre4([1, 2, 4, 1]) → [1, 2] pre4([3, 1, 4]) → [3, 1] pre4([1, 4, 4]) → [1]
	 */

	public int[] pre4(int[] nums) {
		int p = 0;
		int[] arr;
		while (nums[p] != 4)
			p++;
		arr = new int[p];
		for (int i = 0; i < p; i++)
			arr[i] = nums[i];
		return arr;
	}

	/*
	 * Given a non-empty array of ints, return a new array containing the elements
	 * from the original array that come after the last 4 in the original array. The
	 * original array will contain at least one 4. Note that it is valid in java to
	 * create an array of length 0.
	 * 
	 * 
	 * post4([2, 4, 1, 2]) → [1, 2] post4([4, 1, 4, 2]) → [2] post4([4, 4, 1, 2, 3])
	 * → [1, 2, 3]
	 */

	public int[] post4(int[] nums) {
		int p = nums.length - 1;
		int[] arr;
		while (nums[p] != 4)
			p--;
		arr = new int[nums.length - 1 - p];
		for (int i = p + 1; i < nums.length; i++)
			arr[i - p - 1] = nums[i];
		return arr;
	}

	/*
	 * We'll say that an element in an array is "alone" if there are values before
	 * and after it, and those values are different from it. Return a version of the
	 * given array where every instance of the given value which is alone is
	 * replaced by whichever value to its left or right is larger.
	 * 
	 * 
	 * notAlone([1, 2, 3], 2) → [1, 3, 3] notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3,
	 * 3, 5, 5, 2] notAlone([3, 4], 3) → [3, 4]
	 */

	public int[] notAlone(int[] nums, int val) {
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] == val) {
				if (nums[i - 1] != val && nums[i + 1] != val)
					nums[i] = (nums[i - 1] > nums[i + 1]) ? nums[i - 1] : nums[i + 1];
			}
		}
		return nums;
	}
}
