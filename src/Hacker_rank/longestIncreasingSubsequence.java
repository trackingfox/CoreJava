package Hacker_rank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem: Write a program that takes as input an array of numbers and returns
 * the length of a longest nondecreasing/increasing subsequence in the array
 */
public class longestIncreasingSubsequence {
	/*
	 * Basic idea is create a temporary 1 dimension array of same length as that of
	 * A. Initialize all its fields to 1 because every element is 1 length array of
	 * increasing element In second step
	 */
	public int longestNonDecreasingSubsequenceLength(List<Integer> A) {
		Integer[] longestSubsequenceArray = new Integer[A.size()];
		// Initialize every element to 1
		Arrays.fill(longestSubsequenceArray, 1);

		// Create a loop from 1 to length of A, and second loop of j = 0 to j < i. Check
		// if the element at i is
		// greater than element at j if yes set longestSubsequenceArray[i] =
		// Math.max(longestSubsequenceArray[i], longestSubsequenceArray[j]+1)
		for (int i = 1; i < A.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (A.get(i) > A.get(j)) {
					longestSubsequenceArray[i] = Math.max(longestSubsequenceArray[i], longestSubsequenceArray[j] + 1);
				}
			}
		}
		return Collections.max(Arrays.asList(longestSubsequenceArray));
	}

}
