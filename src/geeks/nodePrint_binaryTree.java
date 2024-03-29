package geeks;

import java.util.LinkedList;
import java.util.Queue;

public class nodePrint_binaryTree {

	Node root;

	/*
	 * Given a binary tree, print nodes from level number 'low' to level number
	 * 'high'
	 */
	void printLevels(Node node, int low, int high) {

		Queue<Node> Q = new LinkedList<>();

		Node marker = new Node(4);// Marker node to indicate end of level
		int level = 1;

		Q.add(node);
		Q.add(marker);

		// simple level order traversal loop
		while (Q.isEmpty() == false) {

			// Remove the front item from the queue
			Node n = Q.peek();
			Q.remove();

			// check if end of level is reached
			if (n == marker) {
				// print a new line and increment level number
				System.out.println("");
				level++;

				// Check if marker node was last node in queue or
				// level number is beyond the given upper limit

				if (Q.isEmpty() == true || level > high)
					break;

				// Enqueue the marker for end of next level

				Q.add(marker);

				// If this is marker, then we don't need print it
				// and enqueue its children

				continue;
			}

			// if level is equal to or greater than given lower level,
			// print it

			if (level >= low)
				System.out.println(n.data + " ");

			// Enqueue children of non-marker node

			if (n.left != null)
				Q.add(n.left);

			if (n.right != null)
				Q.add(n.right);

		}

	}

	// Driver program to test for above functions
	public static void main(String args[]) {
		nodePrint_binaryTree tree = new nodePrint_binaryTree();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(22);

		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);

		System.out.print("Level Order traversal between given two levels is ");
		tree.printLevels(tree.root, 2, 3);

	}
}
