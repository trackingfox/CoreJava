
package com.codingbat;

public class Recursion1 {

	/*
	 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2)
	 * ... 1. Compute the result recursively (without loops).
	 * 
	 * 
	 * factorial(1) → 1 factorial(2) → 2 factorial(3) → 6
	 */

	public int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	/*
	 * We have a number of bunnies and each bunny has two big floppy ears. We want
	 * to compute the total number of ears across all the bunnies recursively
	 * (without loops or multiplication).
	 * 
	 * 
	 * bunnyEars(0) → 0 bunnyEars(1) → 2 bunnyEars(2) → 4
	 */

	public int bunnyEars(int bunnies) {
		if (bunnies == 0)
			return 0;
		return 2 + bunnyEars(bunnies - 1);
	}

	/*
	 * The fibonacci sequence is a famous bit of mathematics, and it happens to have
	 * a recursive definition. The first two values in the sequence are 0 and 1
	 * (essentially 2 base cases). Each subsequent value is the sum of the previous
	 * two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
	 * Define a recursive fibonacci(n) method that returns the nth fibonacci number,
	 * with n=0 representing the start of the sequence.
	 * 
	 * 
	 * fibonacci(0) → 0 fibonacci(1) → 1 fibonacci(2) → 1
	 */

	public int fibonacci(int n) {
		if (n < 2)
			return n;
		return fibonacci(n - 2) + fibonacci(n - 1);
	}

	/*
	 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3,
	 * ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3
	 * ears, because they each have a raised foot. Recursively return the number of
	 * "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
	 * 
	 * 
	 * bunnyEars2(0) → 0 bunnyEars2(1) → 2 bunnyEars2(2) → 5
	 */

	public int bunnyEars2(int bunnies) {
		if (bunnies == 0)
			return 0;
		if (bunnies % 2 == 1)
			return 2 + bunnyEars2(bunnies - 1);
		return 3 + bunnyEars2(bunnies - 1);
	}

	/*
	 * We have triangle made of blocks. The topmost row has 1 block, the next row
	 * down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively
	 * (no loops or multiplication) the total number of blocks in such a triangle
	 * with the given number of rows.
	 * 
	 * 
	 * triangle(0) → 0 triangle(1) → 1 triangle(2) → 3
	 */

	public int triangle(int rows) {
		if (rows < 2)
			return rows;
		return rows + triangle(rows - 1);
	}

	/*
	 * Given a non-negative int n, return the sum of its digits recursively (no
	 * loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
	 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
	 * 
	 * 
	 * sumDigits(126) → 9 sumDigits(49) → 13 sumDigits(12) → 3
	 */

	public int sumDigits(int n) {
		if (n < 10)
			return n;
		return sumDigits(n / 10) + n % 10;
	}

	/*
	 * Given a non-negative int n, return the count of the occurrences of 7 as a
	 * digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10
	 * yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
	 * the rightmost digit (126 / 10 is 12).
	 * 
	 * 
	 * count7(717) → 2 count7(7) → 1 count7(123) → 0
	 * 
	 */
	public int count7(int n) {
		if (n == 0)
			return 0;
		if (n % 10 == 7)
			return 1 + count7(n / 10);
		return count7(n / 10);
	}

	/*
	 * Given base and n that are both 1 or more, compute recursively (no loops) the
	 * value of base to the n power, so powerN(3, 2) is 9 (3 squared).
	 * 
	 * 
	 * powerN(3, 1) → 3 powerN(3, 2) → 9 powerN(3, 3) → 27
	 */
	public int powerN(int base, int n) {
		if (n == 1)
			return base;
		return base * powerN(base, n - 1);
	}

	/*
	 * Given a string, compute recursively (no loops) the number of lowercase 'x'
	 * chars in the string.
	 * 
	 * 
	 * countX("xxhixx") → 4 countX("xhixhix") → 3 countX("hi") → 0
	 */

	public int countX(String str) {
		if (str.length() == 0)
			return 0;
		if (str.charAt(0) == 'x')
			return 1 + countX(str.substring(1));
		return countX(str.substring(1));
	}

	/*
	 * Given a string, compute recursively (no loops) the number of times lowercase
	 * "hi" appears in the string.
	 * 
	 * 
	 * countHi("xxhixx") → 1 countHi("xhixhix") → 2 countHi("hi") → 1
	 */

	public int countHi(String str) {
		if (str.length() < 2)
			return 0;
		if (str.charAt(0) == 'h' && str.charAt(1) == 'i')
			return 1 + countHi(str.substring(2));
		return countHi(str.substring(1));
	}

	/*
	 * Given a string, compute recursively (no loops) a new string where all the
	 * lowercase 'x' chars have been changed to 'y' chars.
	 * 
	 * 
	 * changeXY("codex") → "codey" changeXY("xxhixx") → "yyhiyy" changeXY("xhixhix")
	 * → "yhiyhiy"
	 */

	public String changeXY(String str) {
		char ch;
		if (str.length() == 0)
			return str;
		ch = str.charAt(0);
		if (ch == 'x')
			return 'y' + changeXY(str.substring(1));
		return ch + changeXY(str.substring(1));
	}

	/*
	 * Given a string, compute recursively (no loops) a new string where all
	 * appearances of "pi" have been replaced by "3.14".
	 * 
	 * 
	 * changePi("xpix") → "x3.14x" changePi("pipi") → "3.143.14" changePi("pip") →
	 * "3.14p"
	 */

	public String changePi(String str) {
		String left;
		if (str.length() < 2)
			return str;
		if (str.substring(0, 2).equals("pi"))
			return "3.14" + changePi(str.substring(2));
		return str.charAt(0) + changePi(str.substring(1));
	}

	/*
	 * Given a string, compute recursively a new string where all the 'x' chars have
	 * been removed.
	 * 
	 * 
	 * noX("xaxb") → "ab" noX("abc") → "abc" noX("xx") → ""
	 */

	public String noX(String str) {
		char ch;
		if (str.length() == 0)
			return str;
		ch = str.charAt(0);
		if (ch == 'x')
			return noX(str.substring(1));
		return ch + noX(str.substring(1));
	}

	/*
	 * Given a string, compute recursively a new string where all the adjacent chars
	 * are now separated by a "*".
	 * 
	 * 
	 * allStar("hello") → "h*e*l*l*o" allStar("abc") → "a*b*c" allStar("ab") → "a*b"
	 */

	public String allStar(String str) {
		if (str.length() < 2)
			return str;
		return str.charAt(0) + "*" + allStar(str.substring(1));
	}

	/*
	 * Given a string, compute recursively a new string where all the lowercase 'x'
	 * chars have been moved to the end of the string.
	 * 
	 * 
	 * endX("xxre") → "rexx" endX("xxhixx") → "hixxxx" endX("xhixhix") → "hihixxx"
	 */

	public String endX(String str) {
		if (str.length() == 0)
			return str;
		if (str.charAt(0) == 'x')
			return endX(str.substring(1)) + 'x';
		return str.charAt(0) + endX(str.substring(1));
	}

	/*
	 * Count recursively the total number of "abc" and "aba" substrings that appear
	 * in the given string.
	 * 
	 * 
	 * countAbc("abc") → 1 countAbc("abcxxabc") → 2 countAbc("abaxxaba") → 2
	 * 
	 */

	public int countAbc(String str) {
		String left;
		if (str.length() < 3)
			return 0;
		left = str.substring(0, 3);
		if (left.equals("abc"))
			return 1 + countAbc(str.substring(3));
		if (left.equals("aba"))
			return 1 + countAbc(str.substring(2));
		return countAbc(str.substring(1));
	}

	/*
	 * Given a string, compute recursively (no loops) the number of "11" substrings
	 * in the string. The "11" substrings should not overlap.
	 * 
	 * 
	 * count11("11abc11") → 2 count11("abc11x11x11") → 3 count11("111") → 1
	 */

	public int count11(String str) {
		if (str.length() < 2)
			return 0;
		if (str.substring(0, 2).equals("11"))
			return 1 + count11(str.substring(2));
		return count11(str.substring(1));
	}

	/*
	 * Given a string, return recursively a "cleaned" string where adjacent chars
	 * that are the same have been reduced to a single char. So "yyzzza" yields
	 * "yza".
	 * 
	 * 
	 * stringClean("yyzzza") → "yza" stringClean("abbbcdd") → "abcd"
	 * stringClean("Hello") → "Helo"
	 * 
	 */

	public String stringClean(String str) {
		if (str.length() < 2)
			return str;
		if (str.charAt(0) == str.charAt(1))
			return stringClean(str.substring(1));
		return str.charAt(0) + stringClean(str.substring(1));
	}
}
