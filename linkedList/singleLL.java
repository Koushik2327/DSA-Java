package linkedList;

import java.util.LinkedList;
public class singleLL {
	
	public  Node reverseList(Node head) {
		if(head==null) {
			return head;
		}
		Node pre =null;
		Node curr =head;
		while(curr!=null) {
			Node nxt =curr.next;
			curr.next = pre;
			pre = curr;
			curr = nxt;
		}
		
		return pre;
	}
	
	
	public void traverse(Node head) {
		 Node temp = head;

	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }

	        System.out.println("null");
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
		
		Node head = n1;
		
		singleLL s1 = new singleLL();
		
		head=s1.reverseList(head);
		s1.traverse(head);
		

	}

}
