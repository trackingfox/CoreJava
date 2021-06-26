package com.codingbat;

import java.util.Scanner;

public class fibonacci_recursion {

	static int n1 = 0, n2 = 1, n3 = 0;

	static void printFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.println(n3);
			printFibonacci(count - 1);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count");
		int count = sc.nextInt();

		// printing 0 and 1
		System.out.println(n1);
		System.out.println(n2);

		printFibonacci(count - 2);

	}

}
