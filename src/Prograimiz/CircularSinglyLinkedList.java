package Prograimiz;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {

	private ListNode last;
	private int length;

	private class ListNode {
		private ListNode next;
		private int data;

		public ListNode(int data) {
			this.data = data;

		}
	}

	public CircularSinglyLinkedList() {
		last = null;
		length = 0;
	}

	public int length() {
		return length;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void createCircularLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(10);
		ListNode fourth = new ListNode(15);

		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;

		last = fourth;
	}

	public void display() {
		if (last == null) {
			return;
		}
		ListNode first = last.next;
		while (first != last) {
			System.out.print(first.data + " ");
			first = first.next;
		}
		System.out.println(first.data);
	}

	public void insertFirst(int data) {
		ListNode temp = new ListNode(data);
		if (last == null) {
			last = temp;
		} else {
			temp.next = last.next;
		}
		last.next = temp;
		length++;
	}

	public void insertLast(int data) {
		ListNode temp = new ListNode(data);
		if (last == null) {
			last = temp;
			last.next = last;
		} else {
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}

		length++;

	}

	public ListNode removeFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException("Circular Singly LinkedList is already empty");
		}

		ListNode temp = last.next;
		if (last.next == last) {
			last = null;

		} else {
			last.next = temp.next;
		}
		temp.next = null;
		length--;
		return temp;

	}

	public static void main(String[] args) {

//		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
//		csll.createCircularLinkedList();
//		csll.display();

//		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
//		csll.insertFirst(10);
//		csll.insertFirst(15);
//		csll.display();

		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		csll.insertLast(1);
		csll.insertLast(8);
		csll.insertLast(10);
		csll.display();

		csll.removeFirst();
		csll.removeFirst();
		csll.display();

	}

}
