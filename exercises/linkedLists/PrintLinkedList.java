package linkedLists;

public class PrintLinkedList {
	public static void main(String...arg){
		int[] array = {1, 11, 32, 81, 45, 2, 34, 56, 90};
//		int[] array = {1};
//		int[] array = {1, 11};
		
		Node head = buildList(array);
		printList(head);
		System.out.println();
		printReversedList(head);
		System.out.println();
		printAlternate(head);
	}
	
	public static Node buildList(int[] a){
		Node head = null;
		Node p = null;
		Node last = null;
		
		for (int k = 0; k < a.length; k++){
			p = new Node(a[k]);
			
			if (head == null) {
				head = p;
			} else {
				last.setNext(p);
			}
			last = p;
		}
		
		return head;
	}
	
	public static void printList(Node p){
		if (p == null)  {
			return;
		}
		System.out.format("%d ", p.getData());
		printList(p.getNext());
	}
	
	public static void printReversedList(Node p) {
		if (p == null) {
			return;
		}
		printReversedList(p.getNext());
		System.out.format("%d ", p.getData());
	}
	
	public static void printAlternate(Node p){
		// List has one node
		if (p.getNext() == null) {
			System.out.format("%d ", p.getData());
			return;
		}
		
		if (p.getNext().getNext() == null) {
			System.out.format("%d ", p.getData());
			return;
		}
		System.out.format("%d ", p.getData());
		printAlternate(p.getNext().getNext());
	}
}
