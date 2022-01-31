package Prograimiz;

public class MaxPQ {
	private Integer[] heap;
	private int n;// size of max heap

	public MaxPQ(int capacity) {
		heap = new Integer[capacity + 1];// index 0 is kept as empty
		n = 0;
	}

	public boolean isEmpty() {
		return n == 0;
	}

	public int size() {
		return n;
	}

	public void insert(int x) {
		if (n == heap.length - 1) {
			resize(2 * heap.length);
		}

	}

	private void resize(int capacity) {
		Integer[] temp = new Integer[capacity];
		for (int i = 0; i < heap.length; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
	}

	public void printMaxHeap() {
		for (int i = 1; i <= n; i++) {
			System.out.println(heap[i] + " ");
		}
	}

	// TOP DOWN REHEAPIFY (while deleting a node)
	private void sink(int k) {
		while (2 * k <= n) {
			int j = 2 * k;
			if (j < n && heap[j] < heap[j + 1]) {
				j++;
			}

			if (heap[k] >= heap[j]) {
				break;
			}

			swap(k, j);
			k = j;
		}
	}

	public void swap(int a, int b) {
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}

	public int deleteMax() {
		int max = heap[1];
		swap(1, n);
		n--;
		sink(1);
		heap[n + 1] = null;
		if (n > 0 && (n == (heap.length - 1) / 4)) {
			resize(heap.length / 2);
		}
		return max;
	}

	public static void main(String[] args) {
		MaxPQ pq = new MaxPQ(3);
		pq.insert(4);
		pq.insert(5);
		pq.insert(2);
		pq.insert(6);
		pq.insert(1);
		pq.insert(3);
		System.out.println(pq.size());// 0
		pq.printMaxHeap();
		System.out.println(pq.isEmpty());// true
	}

}
