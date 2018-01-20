package linkedList;

public class DoublyLinkStruct {
	Node head; // available to entire class

	class Node {
		int data;
		Node next, prev;

		public Node(int data) {

			this.data = data;
			prev = next = null;
		}
	}

	public DoublyLinkStruct() {
		head = null;
	}

	public void front(int data){  //insert in front
		Node nNode= new Node(data);
		nNode.next=head;
		nNode.prev=null;
		if(head!=null){
			head.prev=nNode;
		}
		head=nNode;
	}

	public void inBetween(Node pNode , int data){  //inserting in between
		Node nNode =new Node(data);
		if(pNode==null)
		{
			nNode.next=head;
			nNode.prev=null;
			head=nNode;
		}
		nNode.next=pNode.next;
		pNode.next=nNode;
		nNode.prev=pNode;
		if(nNode.next!=null)
		{
			nNode.next.prev=nNode;
		}
		
	}
	public void atLast(int data)
	{
		Node nNode =new Node(data);
		if(head==null)   //base condition is the node is first
		{
			nNode.next=head;
			nNode.prev=null;
			head=nNode;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=nNode;
		nNode.prev=temp;
		nNode.next=null;
		
	}
	public void print() {
		Node temp = head;
		while (temp!= null) {
			System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DoublyLinkStruct l = new DoublyLinkStruct();
		l.front(1);
		l.front(2);
		l.front(3);
		l.front(4);
		l.front(5);
		l.front(6);
		l.atLast(9);
		l.inBetween(l.head.next, 8);
		l.print();

	}

}
