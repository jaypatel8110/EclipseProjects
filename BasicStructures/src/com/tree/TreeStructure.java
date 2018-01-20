package com.tree;

public class TreeStructure {

	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	Node root;

	public TreeStructure() {
		root = null;
	}

	void insert(int data) {

		root = insertmain(root, data);
	}

	Node insertmain(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (root.data <= data) {
			root.left = insertmain(root.left, data);

		} else if (root.data > data) {
			root.right = insertmain(root.right, data);
		}
		return root;
	}

	void printone() {
		printmain(root);
	}

	void printmain(Node root) {
		if (root != null) {

			printmain(root.left);
			System.out.println(root.data);
			printmain(root.right);
		}

	}

	public static void main(String[] args) {
		TreeStructure tree = new TreeStructure();
		tree.insert(2);
		tree.insert(4);
		tree.insert(4);
		tree.insert(7);
		tree.insert(1);
		tree.printone();

	}

}
