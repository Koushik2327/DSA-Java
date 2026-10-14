package DoubleLinkedList;

class DoubleListNode{
	int val;
	DoubleListNode prev;
	DoubleListNode next;
	
	public DoubleListNode(int val) {
		this.val=val;
		prev=null;
		next=null;
	}
}
public class DoublyLL {
	
	
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
		
		Doubletravese dt = new Doubletravese();
		
		System.out.println("print from backwords: ");
		dt.printFromback(l2);
		
		System.out.println();
		
		System.out.println("print from starting: ");
		dt.printFromBeg(l3);

	}

}
