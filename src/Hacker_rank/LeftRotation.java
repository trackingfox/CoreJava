
//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem

package Hacker_rank;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotation {

	static int[] rotLeft(int[] a, int d) {
		int n = a.length;
		int[] rotArray = new int[n];

		for (int oldIndex = 0; oldIndex < n; oldIndex++) {
			int newIndex = (oldIndex + n - d) % n;
			rotArray[newIndex] = a[oldIndex];
		}

		return rotArray;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		int d = sc.nextInt();
		int a[] = new int[arraySize];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int res[] = rotLeft(a, d);
		System.out.println(Arrays.toString(res));
		sc.close();
	}

}