package Prograimiz;

public class Merge_sortedList {

	private ListNode head;

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display() {
		ListNode current = head;

		while (current != null) {
			System.out.println(current.data + "--> ");
			current = current.next;
		}
		System.out.println("null");
		System.out.println();
	}

	public static ListNode merge(ListNode a, ListNode b) {

	}

}
