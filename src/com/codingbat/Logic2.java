package com.codingbat;

public class Logic2 {

	/*
	 * We want to make a row of bricks that is goal inches long. We have a number of
	 * small bricks (1 inch each) and big bricks (5 inches each). Return true if it
	 * is possible to make the goal by choosing from the given bricks. This is a
	 * little harder than it looks and can be done without any loops. See also:
	 * Introduction to MakeBricks
	 * 
	 * 
	 * makeBricks(3, 1, 8) → true makeBricks(3, 1, 9) → false makeBricks(3, 2, 10) →
	 * true
	 */

	public boolean makeBricks(int small, int big, int goal) {

		int digit = goal % 10;
		if (goal > small + (big * 5))
			return false;
		if (digit < 5 && small < digit)
			return false;
		else if (digit > 5 && digit > small + 5)
			return false;
		else
			return true;

	}

	/*
	 * Given 3 int values, a b c, return their sum. However, if one of the values is
	 * the same as another of the values, it does not count towards the sum.
	 * 
	 * 
	 * loneSum(1, 2, 3) → 6 loneSum(3, 2, 3) → 2 loneSum(3, 3, 3) → 0
	 */

	public int loneSum(int a, int b, int c) {

		if (a == b && b == c)
			return 0;
		if (a == b)
			return c;
		if (b == c)
			return a;
		if (a == c)
			return b;
		else
			return a + b + c;

	}

	/*
	 * Given 3 int values, a b c, return their sum. However, if one of the values is
	 * 13 then it does not count towards the sum and values to its right do not
	 * count. So for example, if b is 13, then both b and c do not count.
	 * 
	 * 
	 * luckySum(1, 2, 3) → 6 luckySum(1, 2, 13) → 3 luckySum(1, 13, 3) → 1
	 * 
	 */

	public int luckySum(int a, int b, int c) {

		if (a == 13)
			return 0;
		else if (b == 13)
			return a;
		else if (c == 13)
			return a + b;
		else
			return a + b + c;
	}

	/*
	 * Given 2 int values greater than 0, return whichever value is nearest to 21
	 * without going over. Return 0 if they both go over.
	 * 
	 * 
	 * blackjack(19, 21) → 21 blackjack(21, 19) → 21 blackjack(19, 22) → 19
	 */

	public int blackjack(int a, int b) {
		if (a > 21 && b > 21)
			return 0;
		if (a > 21)
			return b;
		if (b > 21)
			return a;
		return a > b ? a : b;
	}

	/*
	 * Given three ints, a b c, one of them is small, one is medium and one is
	 * large. Return true if the three values are evenly spaced, so the difference
	 * between small and medium is the same as the difference between medium and
	 * large.
	 * 
	 * 
	 * evenlySpaced(2, 4, 6) → true evenlySpaced(4, 6, 2) → true evenlySpaced(4, 6,
	 * 3) → false
	 */
	public boolean evenlySpaced(int a, int b, int c) {
		return ((a + b) == 2 * c) || ((a + c) == 2 * b) || ((b + c) == 2 * a);
	}

	/*
	 * Given three ints, a b c, return true if one of b or c is "close" (differing
	 * from a by at most 1), while the other is "far", differing from both other
	 * values by 2 or more. Note: Math.abs(num) computes the absolute value of a
	 * number.
	 * 
	 * 
	 * closeFar(1, 2, 10) → true closeFar(1, 2, 3) → false closeFar(4, 1, 3) → true
	 */

	public boolean closeFar(int a, int b, int c) {
		if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2) {
			return true;
		} else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2) {
			return true;
		} else {
			return false;
		}

	}

}
