package com.codingbat;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 4, 3, 22, 1, 1, 3 };

		Map<Integer, Integer> hm = new HashMap<>();
		for (int no : arr) {
			Integer count = hm.get(no);
			if (count == null) {
				hm.put(no, 1);
			} else {
				count = count + 1;
				hm.put(no, count);
			}
		}

		System.out.println("Duplicate elements are : ");
		Set<Map.Entry<Integer, Integer>> es = hm.entrySet();

		for (Map.Entry<Integer, Integer> me : es) {

			if (me.getValue() > 1) {
				System.out.println(me.getKey() + " ");
			}
		}
	}

}
