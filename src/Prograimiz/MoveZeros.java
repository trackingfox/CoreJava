package Prograimiz;

public class MoveZeros {

	public static void moveZeros(int[] arr, int n) {
		int j = 0;// focus on zeroth elements
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		moveZeros(new int[] { 1, 0, 12, 0, 8, 9 }, 6);

	}

}
