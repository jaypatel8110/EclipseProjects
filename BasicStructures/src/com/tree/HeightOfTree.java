package com.tree;


public class HeightOfTree {

	class Node {
		int data;
		Node left, right;

		public Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	Node root;

	public HeightOfTree() {
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
		HeightOfTree tree = new HeightOfTree();
		tree.insert(1);
		tree.insert(2);
//		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.printone();
		System.out.println("Height is "+tree.height());

	}
	
	int height()
	{
		int h=Findheight(root);
		return h;
	}
	int Findheight(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int l=Findheight(root.left);
		int r=Findheight(root.right);
		return Math.max(l, r)+1;
	}

}

