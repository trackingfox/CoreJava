package LeetCode;

public class equalizeArray {

	public int minOperations(int n) {
		int maxval = n * 2 - 1;// by the rule arr[i] = (2*)+1

		if (n % 2 == 0) {
			int lo = 1, hi = maxval / 2;
			return (lo + hi) * (hi + 1) / 2 / 2;
		} else {
			int lo = 2, hi = maxval / 2;
			return (lo + hi) * (hi / 2) / 2;
		}
	}

}
