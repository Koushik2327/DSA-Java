package DoubleLinkedList;

public class Insertion {

	public DoubleListNode insertatStrat(DoubleListNode node,int val) {
		while(node.prev!=null) {
			node=node.prev;
		}
		
		DoubleListNode newnode = new DoubleListNode(val);
		newnode.next=node;
		node.prev=newnode;
		
		return newnode;
	}
	
	public void insertatLast(DoubleListNode node,int val) {
		
		while(node.next!=null) {
			node=node.next;
		}
		
		DoubleListNode newnode = new DoubleListNode(val);
		newnode.prev=node;
		node.next=newnode;
		
	}
	
	public void insertatPosition(DoubleListNode node, int val, int pos) {
		while(node.prev!=null) {
			node=node.prev;
		}
		for(int i=1;i<pos;i++) {
			node=node.next;
		}
		
		DoubleListNode newnode = new DoubleListNode(val);
		newnode.next=node.next;
		newnode.prev=node;
		node.next.prev=newnode;
		node.next=newnode;
		
	}
	
	public static void main(String[] args) {
		DoubleListNode l1= new DoubleListNode(3);
		DoubleListNode l2= new DoubleListNode(7);
		DoubleListNode l3= new DoubleListNode(8);
		DoubleListNode l4= new DoubleListNode(2);
		
		
//		linking
		
		l1.next = l2;
		
		l2.next =l3;
		l2.prev =l1;
		
		l3.next =l4;
		l3.prev =l2;
		
		l4.prev=l3;
		
		Insertion in = new Insertion();
		System.out.println("insert at Start: ");
		DoubleListNode dn= in.insertatStrat(l4, 1);
		
		in.insertatLast(l3, 2);
		
		in.insertatPosition(l3, 5, 3);
		
		Doubletravese dt = new Doubletravese();
		
		dt.printFromBeg(l2);
		
		System.out.println();
	}

}
