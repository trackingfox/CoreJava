package DataStructure;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = { 36, 19, 29, 12, 5 };

		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; i++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

	}

}
