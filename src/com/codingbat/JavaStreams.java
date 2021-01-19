package com.codingbat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {

		// Integer Stream
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();

		// Integer Stream with skip
		IntStream.range(1, 10).skip(5).forEach(x -> System.out.println(x));
		System.out.println();

		// Integer stream with sum
		System.out.println(IntStream.range(1, 5).sum());
		System.out.println();

		// Stream.of , sorted and findFirst
		Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::println);

		// Stream from Array sort, filter and print
		String[] names = { "Al", "Ankit", "Kushal", "Brent" };
		Arrays.stream(names).filter(x -> x.startsWith("S")).sorted().forEach(System.out::println);

		// average of squares of an int array
		Arrays.stream(new int[] { 2, 4, 6, 8, 10 }).map(x -> x * x).average().ifPresent(System.out::println);

		// Stream from List, filter and print
		List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent");
		people.stream().map(String::toLowerCase).filter(x -> x.startsWith("a")).forEach(System.out::println);

	}

}
