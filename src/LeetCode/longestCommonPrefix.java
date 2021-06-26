package LeetCode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class longestCommonPrefix {

	/*
	 * prefix="fl" ["flow","flight"];
	 */
	public String lcp(String[] strs) {
		if (strs.length == 0)
			return "";

		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;

	}

	@Test
	public void sleepIntest() {
		Assert.assertEquals(lcp(true, false), false);
		Assert.assertEquals(sleepIn(false, false), true);
		Assert.assertEquals(sleepIn(true, true), true);
		Assert.assertEquals(sleepIn(false, true), true);
	}

}