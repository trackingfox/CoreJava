package Hacker_rank;

import java.util.Scanner;

public class TwoPointerTechnique {

	// Two Pointer Technique (Opposite-directional)
	static int[] twoSum(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int result[] = new int[2];

		while (start < end) {
			int sum = nums[start] + nums[end];
			if (sum == target) {
				result[0] = start + 1;
				result[1] = end + 1;
				break;
			} else if (sum < target) {
				start++;
			} else {
				end--;
			}
		}
		return result;
	}

	// Two Pointer Technique (Equi-directional)
	public static int getMaxSumSubArrayOfSizeKM2(int[] A, int k) {
		int windowSum = 0, maxSum = 0;
		int wStart = 0;
		int wEnd = 0;

		while (wEnd < k) {
			windowSum += A[wEnd++];
		}

		while (wEnd < A.length) {
			windowSum += A[wEnd++] - A[wStart++];
			maxSum = Math.max(maxSum, windowSum);
		}

		return maxSum;
	}

	public static void main(String[] args) {
//		runTwoSum();
		runGetMaxSumSubArrayOfSizeKM2();
	}

	private static void runTwoSum() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int result[] = twoSum(nums, target);
		System.out.println("ans :[" + result[0] + "," + result[1] + "]");
		sc.close();
	}

	private static void runGetMaxSumSubArrayOfSizeKM2() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int A[] = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int maxSum = getMaxSumSubArrayOfSizeKM2(A, k);
		System.out.println("max sum :" + maxSum);
		sc.close();
	}

}