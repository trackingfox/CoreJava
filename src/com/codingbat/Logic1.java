package com.codingbat;

public class Logic1 {

	/*
	 * When squirrels get together for a party, they like to have cigars. A squirrel
	 * party is successful when the number of cigars is between 40 and 60,
	 * inclusive. Unless it is the weekend, in which case there is no upper bound on
	 * the number of cigars. Return true if the party with the given values is
	 * successful, or false otherwise.
	 * 
	 * 
	 * cigarParty(30, false) → false cigarParty(50, false) → true cigarParty(70,
	 * true) → true
	 */
	// SOLUTION 1
	public boolean cigarParty(int cigars, boolean isWeekend) {

		return isWeekend ? cigars >= 40 : cigars >= 40 && cigars <= 60;
	}

	// SOLUTION 2
	public boolean cigarParty2(int cigars, boolean isWeekend) {
		if (isWeekend == true && cigars >= 40)
			return true;
		if (!(isWeekend) && cigars >= 40 && cigars <= 60)
			return true;
		else
			return false;

	}

}
