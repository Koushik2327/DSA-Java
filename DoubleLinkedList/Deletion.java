package DoubleLinkedList;

public class Deletion {
	
	public DoubleListNode deleteatFirst(DoubleListNode node) {
		while(node.prev!=null) {
			node = node.prev;
		}
		
		if(node.next==null) {
			return null;
		}
		node=node.next;
		node.prev=null;
		
		return node;
	}
	
	public DoubleListNode deleteAtLast(DoubleListNode node) {
		while(node.next!=null) {
			node = node.next;
		}
		
		if(node.prev==null) {
			return null;
		}
		
		node.prev.next=null;
		
		return node;
	}
	
	
	public DoubleListNode deleteAtPosition(DoubleListNode node,int pos) {
		while(node.prev!=null) {
			node=node.prev;
		}
		
		if(pos<1) {
			return node;
		}
		if(pos==1) {
			return deleteAtLast(node);
		}
		return node;
	}
	
	
	public static void main(String[] args) {
			DoubleListNode l1 = new DoubleListNode(3);
	        DoubleListNode l2 = new DoubleListNode(7);
	        DoubleListNode l3 = new DoubleListNode(8);
	        DoubleListNode l4 = new DoubleListNode(2);

	        // Linking nodes
	        l1.next = l2;
	        l2.prev = l1;

	        l2.next = l3;
	        l3.prev = l2;

	        l3.next = l4;
	        l4.prev = l3;

	        Deletion d = new Deletion();

	        Doubletravese dt = new Doubletravese();

	        System.out.println("Original List:");
	        dt.printFromBeg(l1);

	        System.out.println("\nAfter deleting at Start:");
	        DoubleListNode head = d.deleteatFirst(l1);
	        dt.printFromBeg(head);

	        System.out.println("\nAfter deleting at Last:");
	        head = d.deleteAtLast(head);
	        dt.printFromBeg(head);
	        
		
	}

}
