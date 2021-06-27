package com.codingbat;

public class Node1 {

	int key;
	Node1 left, right;

	public Node1(int item) {
		key = item;
		left = right = null;

	}

}

class BinaryTree {
	Node1 root;
	// Traverse tree

	public void traverseTree(Node1 node) {
		if (node != null) {
			traverseTree(node.left);
			System.out.println(" " + node.key);
			traverseTree(node.right);
		}
	}

	public static void main(String[] args) {

		// create an object of BinaryTree
		BinaryTree tree = new BinaryTree();

		// create nodes of the tree
		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left = new Node1(4);

		System.out.println("\nBinary tree: ");
		tree.traverseTree(tree.root);
	}

}
