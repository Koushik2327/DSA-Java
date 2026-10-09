package linkedList;
import linkedList.singleLL;
public class FindMiddle {
	public Node middleNode(Node head) {
		if(head==null) {
			return null;	
		}
		Node slow =head;
		Node fast =head;
		
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;
		
		Node head=n1;
		
		singleLL sl =new singleLL();
		
		
		FindMiddle fm =new FindMiddle();
		Node mid=fm.middleNode(head);
		System.out.println(mid.data);
		sl.traverse(head);
	}
}
