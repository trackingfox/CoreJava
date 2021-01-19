package Hacker_rank;

import java.util.Scanner;

public class StringS1ToS2Transformer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		transformS1ToS2(s1, s2);
		sc.close();

	}

	private static int findLCSLen(String s1, String s2) {
		char[] X = s1.toCharArray();
		char[] Y = s2.toCharArray();
		int m = s1.length();
		int n = s2.length();
		return LongestCommonSubsequence.LCSM4(X, Y, m, n);

	}

	public static void transformS1ToS2(String s1, String s2) {
		int lcsLen = findLCSLen(s1, s2);
		System.out.println("Miinimum deletions required : " + (s1.length() - lcsLen));
		System.out.println("Minimum insertions required : " + (s2.length() - lcsLen));
	}

}
