package technicalQ;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Prograimiz.startNode.ListNode;

public class InterviewTechnical {

	/*
	 * Given two non-negative integers num1 and num2 represented as strings, return
	 * the product of num1 and num2, also represented as a string. Example 1:
	 * 
	 * Input: num1 = "2", num2 = "3" Output: "6"
	 */

	public String multiply(String nums1, String nums2) {
		int[] products = new int[nums1.length() + nums2.length()];
		for (int i = nums1.length() - 1; i >= 0; i--)
			for (int j = nums2.length() - 1; j >= 0; j--)
				products[i + j + 1] += (nums1.charAt(i) - '0') * (nums2.charAt(j) - '0');

		int carry = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = products.length - 1; i >= 0; i--) {
			sb.insert(0, (products[i] + carry) % 10);
			carry = (products[i] + carry) / 10;
		}

		while (sb.length() != 0 && sb.charAt(0) == '0')
			sb.deleteCharAt(0);

		return sb.length() == 0 ? "0" : sb.toString();
	}

	// @Test
	public void multiplyTest() {
		String s = multiply("456", "567");
		System.out.println(s);

	}

	/*
	 * nums = [0,0,1,1,1,2,2,3,3,4] Write a function that returns array without
	 * duplicates
	 */

	List<Integer> findDuplicates(int[] nums) {

		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i] - 1);

			if (nums[index] < 0)
				res.add(Math.abs(nums[i]));
			nums[index] = -nums[index];

		}

		return res;
	}

	// @Test
	public void findDuplicates() {
		List<Integer> res = findDuplicates(new int[] { 1, 2, 3, 3, 3, 2, });
		for (int i : res) {
			System.out.print(i + " ");
		}

	}

	/*
	 * Given the head of a linked list, remove the nth node from the end of the list
	 * and return its head. Input: head = [1,2,3,4,5], n = 2 Output: [1,2,3,5]
	 * 
	 * 
	 * 
	 */

	private ListNode head;

	private static class ListNode {
		private int data; // generic type
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	ListNode removeNthNodeFromEnd(ListNode head, int N) {
		if(head == null)
			return null;
	     
					
		ListNode firstPointer = head;
		ListNode secondPointer = head;
		for(int i =1;i<=N; i=i+1)
			firstPointer = firstPointer->next;
	    
		if(firstPointer == NULL)
			return head->next;
	    while(firstPointer->next) {
	    	firstPointer = firstPointer->next;
	    	secondPointer = secondPointer->next;
	    }
	    
	    ListNode temp = secondPointer->next;
	    secondPointer->next = temp->next;
	    delete(temp);
	    return head;
					
	}

	/*
	 * Given a fixed-length integer array arr, duplicate each occurrence of zero,
	 * shifting the remaining elements to the right. Note that elements beyond the
	 * length of the original array are not written. Do the above modifications to
	 * the input array in place and do not return anything. Example 1: Input: arr =
	 * [1,0,2,3,0,4,5,0] Output: [1,0,0,2,3,0,0,4] Explanation: After calling your
	 * function, the input array is modified to: [1,0,0,2,3,0,0,4]
	 */

	public void duplicateZeros(int[] arr) {
		int[] result = new int[arr.length];
		int index = 0;
		for (int i = 0; i < result.length; i++) {
			if (arr[index] != 0) {
				result[i] = arr[index];
			} else {
				result[i] = 0;
				if (i + 1 < result.length) {
					result[i + 1] = 0;
					i = i + 1;
				}
			}
			index++;
		}
		for (int i = 0; i < result.length; i++) {
			arr[i] = result[i];
			System.out.print(arr[i] + " ");
		}

	}

	@Test
	public void duplicateZerosTest() {
		duplicateZeros(new int[] { 1, 0, 2, 3, 0, 4, 5, 0 });
	}

}
