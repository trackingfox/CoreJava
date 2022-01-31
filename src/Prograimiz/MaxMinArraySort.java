package Prograimiz;

public class MaxMinArraySort {

	void arrangeMaxMin(int[] arr) {
		int maxIdx = arr.length - 1;
		int minIdx = 0;
		int max = arr[maxIdx] + 1;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = arr[i] + (arr[maxIdx] % max) * max;
				maxIdx--;
			} else {
				arr[i] = arr[i] + (arr[minIdx] % max) * max;
				minIdx++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / max;
		}
	}

	public static void main(String[] args) {

	}

}
