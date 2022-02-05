package com.codingbat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class findDuplicates {

	List<Integer> findDuplicates(int[] nums) {

		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i] - 1);

			if (nums[index] < 0)
				res.add(Math.abs(nums[i]));
			nums[index] = -nums[index];

		}

		return res;
	}

	@Test
	public void findDuplicates() {
		List<Integer> res = findDuplicates(new int[] { 1, 2, 3, 3, 3, 2, });
		for (int i : res) {
			System.out.print(i + " ");
		}

	}

}
