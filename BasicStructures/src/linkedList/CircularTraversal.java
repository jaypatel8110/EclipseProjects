package linkedList;

public class CircularTraversal {
	Node head;

	class Node // function to create node
	{
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public CircularTraversal() {
		head = null;
	}

	public void push(int data) {
		Node nNode = new Node(data);
		Node temp = head;
		nNode.next = head;
		if (temp != null) {
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = nNode;

		} else {
			nNode.next = nNode;
		}
		head = nNode;
	}

	void print() {

		if (head != null) {
			Node pNode = head;
			do { // to print if there is only one node
				System.out.print(pNode.data);
				pNode = pNode.next;
			} while (pNode != head);
		}
	}

	public static void main(String[] args) {
		CircularTraversal c = new CircularTraversal();
		c.push(1);
		c.push(2);
		c.push(3);
		c.push(4);
		c.push(5);
		c.push(6);
		c.print();

	}

}
