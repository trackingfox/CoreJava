package DataStructure;

public class MergeSort {

	int[] array;
	int[] tempMergeArr;
	int length;

	public static void main(String[] args) {

		int[] inputArr = { 48, 36, 13, 52, 19, 94, 21 };
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);
	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArr = new int[length];
		divideArray(0, length - 1);
	}

	public void divideArray(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
		}
	}

	public void mergeArray(int lowerInex, int middle, int higherIndex) {

	}
}
