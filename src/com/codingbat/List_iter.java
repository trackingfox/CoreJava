package com.codingbat;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_iter {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		System.out.println("ArrayList: " + numbers);

		// creating an instance of listIterator
		ListIterator<Integer> iterate = numbers.listIterator();
		System.out.println("Iterating over the arrayList :");

		while (iterate.hasNext()) {
			System.out.println(iterate.next() + ", ");
		}

//		// Creating an array list
//	    ArrayList<String> languages = new ArrayList<>();
//	    languages.add("Java");
//	    languages.add("JavaScript");
//	    languages.add("Python");
//	    System.out.println("ArrayList: " + languages);
//
//	        // Using forEach loop
//	    System.out.println("Iterating over ArrayList using for-each loop:");
//	    for(String language : languages) {
//	      System.out.print(language);
//	      System.out.print(", ");

	}

}
