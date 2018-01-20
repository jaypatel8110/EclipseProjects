package linkedList;

public class Structure {
	Node head;  // avalable to entire class
	class Node {
		int data;
		Node next;

		public Node(int data) {

			this.data = data;
			next = null;
		}
	}
	public void push(int data){
		Node new_Node =new Node(data);
		new_Node.next=head;
		head=new_Node;
		
	}
	public void print()
	{
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data);
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Structure l=new Structure();
		l.push(1);
		l.push(2);
		l.push(3);
		l.push(4);
		l.push(5);
		l.push(6);
		l.print();
		System.out.println("head is  "+ l.headData());

	}
	
	//extra functions 
	int headData()
	{
		return head.data;
	}

}
