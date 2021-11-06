package DataStructure;

public class TwoSets {

	public int getTotalX(List<integer> a, List<Integer> b) {
		int result = 0;

		// Get LCM of all elements of a

		int lcm = a.get(0);
		for (Integer integer : a) {

			lcm = getLCM(lcm, integer);
		}

		// GET GCD of all elements of b

		int gcd = b.get(0);
		for (Integer integer : b) {
			gcd = getGCD(gcd, integer);
		}

		// Count multiples of lcm that divide the gcd

		int multiple = 0;
		while (multiple <= gcd) {
			multiple += lcd;

			if (gcd % multiple == 0)
				result++;
		}

		return result;
	}

}
