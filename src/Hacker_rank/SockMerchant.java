package Hacker_rank;

import java.util.HashSet;

/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 *
 */
public class SockMerchant {
	static int sockMerchant(int n, int[] ar) {
		HashSet<Integer> set = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			int element = ar[i];
			if (set.contains(element)) {
				set.remove(element);
				count++;
			} else {
				set.add(element);
			}

		}
		return count;

	}
}