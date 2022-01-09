package Prograimiz;

public class startNode {

	private ListNode head;

	private static class ListNode {
		private int data; // generic type
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public boolean containsLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;

			if (slowPtr == fastPtr) {
				return true;
			}
		}
		return false;
	}

	public ListNode startNodeInALoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;

			if (fastPtr == slowPtr) {
				return getStartingNode(slowPtr);
			}
		}
		return null;
	}

	public ListNode getStartingNode(ListNode slowPtr) {
		ListNode temp = head;
		while (temp != slowPtr) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		return temp; // starting node of the loop
	}

	public void removeLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;

		while (fastPtr != null && fastPtr != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;

			if (fastPtr == slowPtr) {
				removeLoop(slowPtr);
				return;
			}
		}

	}

	public void createALoopInLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);

		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
	}

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.createALoopInLinkedList();
		System.out.println(sll.containsLoop());
		System.out.println();
	}

}
