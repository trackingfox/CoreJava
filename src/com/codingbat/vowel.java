package com.codingbat;

import java.util.Scanner;

public class vowel {

	public static void main(String[] args) {
		// find out if an vowel present in a string

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();

		int count = 0;
		System.out.println(str.length());

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u'
					|| str.charAt(i) == 'i') {
				count++;

			}

		}

		if (count > 0)
			System.out.println("Vowel is present and count :" + count);

	}

}
