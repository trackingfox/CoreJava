package Prograimiz;

public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data; // generic type
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.println(current.data + " --> ");
			current = current.next;
		}

		System.out.println("null");

	}

	public void insert(int position, int value) {
		// 1->4->5
		// 1->6->4->5
		ListNode node = new ListNode(value);

		if (position == 1) {
			node.next = head;
			head = node;
		} else {
			ListNode previous = head;
			int count = 1;

			while (count < position - 1) {
				previous = previous.next;
				count++;
			}

			ListNode current = previous.next;
			previous.next = node;
			node.next = current;
		}
	}

	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}

	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			head = newNode;
			return;
		}
		ListNode current = head;
		while (null != current.next) {
			current = current.next;
		}
		current.next = newNode;
	}

	public int length() {
		if (head == null) {
			return 0;
		}

		int count = 0;
		ListNode current = head;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

	public ListNode deleteLast() {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;

		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;// break the chain
		return current;

	}

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);

		// Now we will connect them together to form a chain
		sll.head.next = second; // 10-->1
		second.next = third;// 10-->1-->8
		third.next = fourth;// 10--->1--->8---->11---->null

		sll.display();
		System.out.println("Length is -" + sll.length());

		sll.insertFirst(11);
		sll.insertFirst(8);
		sll.insertFirst(1);

		sll.display();

	}

}
