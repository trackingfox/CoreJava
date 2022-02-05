package Prograimiz;

import java.util.Arrays;

public class TwoSum {

	public int[] twoSum(int[] arr, int target) {
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;
		int result[] = new int[2];

		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {
				result[0] = arr[left];
				result[1] = arr[right];
				return result;
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return new int[0];
	}

	public void threeSum(int[] arr, int target) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 2; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			while (j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if (sum == target) {
					System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
					j++;
					k--;
				} else if (sum < target) {
					j++;
				} else {
					k--;
				}
			}
		}
	}

}
