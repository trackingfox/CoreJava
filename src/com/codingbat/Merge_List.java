package com.codingbat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge_List {

	public static void main(String[] args) {

		// create first list
		// asList() converts the array into the arrayList
		List<Integer> prime = new ArrayList<>(Arrays.asList(2, 3, 5));
		System.out.println("First List: " + prime);

		// create second list
		List<Integer> even = new ArrayList<>(Arrays.asList(4, 6));
		System.out.println("Second List: " + even);

		// convert both lists into stream
		Stream<Integer> list1 = prime.stream();
		Stream<Integer> list2 = even.stream();

		// merge two streams
		Stream<Integer> merged = Stream.concat(list1, list2);

		// convert the merged stream into list
		List<Integer> numbers = merged.collect(Collectors.toList());
		System.out.println("Merged List: " + numbers);

	}

}
