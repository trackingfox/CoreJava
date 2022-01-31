package Prograimiz;

public class StringInteger {

	public static void main(String[] args) {

	}
//	
//	String num1;
//	String num2;
//	
//	for(i=0;i<num1.length;i++) {
//		
//	}
//	
//	for(i=0;i<num2;i++)
//
//}

//	public interface booksmethods {
//
//		public void add();
//
//		public void delete();
//
//		public void search();
//
//	}
//
//	public abstract class booksm1 {
//		public abstract void addbook();
//
//		public abstract void deletebook();
//
//		public void searchbook() {
//
//		}
//
//		public void add() {
//			System.out.println("add");
//		}
//
//		public void delete() {
//			System.out.println("delete");
//		}
//
//	}
//
//	public void search() {
//		System.out.println("search");
//
//	}

//public int removeduplicates()
// {
//		
//     int[] arr= [0,0,1,1,1,2,2,3,3,4];
//
//    		 
//	 int n= arr.length;
//     
//     if(n ==0 || n==1)
//    	 return n;
//     
//     
//     
//     int [] newarr =new int[n];
//     
//     int j=0;
//     
//     
//     
//     for(int i=0; i< n-1;i++) {
//    	 
//    	 
//    	 if(arr[i] != arr[i+1]) {
//    		 newarr[j++]= arr[i];
//    	 }
//    	 
//    	 newarr[j++] = arr[n-1];
//    	 
//    	 
//    	 for(int i=0; i<j; i++)
//    		 arr[i] = newarr[i];
//    	 
//    	 return j;
//     }
//     
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	void deleteNode(int key) {
		Node first = head;
		Node second = head;
		for (int i = 0; i < key; i++) {
			if (second.next == null) {
				if (i == key - 1)
					head = head.next;
				return;
			}
			second = second.next;
		}

		while (second.next != null) {
			first = first.next;
			second = second.next;
		}

		first.next = first.next.next;
	}

	public void eachOccZeros(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				if (i + 1 != arr.length) {
					for (int j = arr.length - 1; j > i; j--) {
						arr[j] = arr[j - 1];
					}
				}
				i++;
			}
		}
	}
}
