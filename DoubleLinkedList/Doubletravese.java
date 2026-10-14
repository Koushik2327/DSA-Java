package DoubleLinkedList;

public class Doubletravese {
	
//	Forward traverse
	public void printFromBeg(DoubleListNode node) {
		while(node.prev!=null) {
			node= node.prev;
		}
		while(node!=null) {
			System.out.print(node.val+"->");
			node =node.next;
		}
	}
	
//	Backward traverse
	public void printFromback(DoubleListNode node) {
		while(node.next!=null) {
			node = node.next;
		}
		while(node!=null) {
			System.out.print(node.val+"->");
			node=node.prev;
		}
	}
}
