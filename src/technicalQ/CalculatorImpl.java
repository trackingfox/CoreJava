package technicalQ;

interface Calculator {

//	void switchOn();

//	void sum(int input);

	int subtract(int i1, int i2);
}

public class CalculatorImpl {

	public void calc() {
		// Calculator calculator = (i1, i2) -> i2 - i1;

		Calculator calculator = (i1, i2) -> {
			if (i2 < i1) {
				throw new RuntimeException("message");
			} else {
				return i2 - i1;
			}
		};
		System.out.println(calculator.subtract(8, 20));
	}
}
