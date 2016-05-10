package linkedLists;

import java.util.Random;

public class ReverseLinkedList {

	public static void main(String[] args) {
		Node head = buildList(10);
		printList(head);
		Node nHead = reverseLinkedList(head);
		System.out.println();
		printList(nHead);
	}
	
	public static Node reverseLinkedList(Node head) {
		Node p = head;
		Node newHead = null;
		Node q = null;
		
		while(p != null) {
			q = new Node(p.getData());
			if (newHead != null) {
				q.setNext(newHead);
			} 
			newHead = q;
			p = p.getNext();
		}
		
		return newHead;
	}
	
	public static void printList(Node p){
		if (p == null)  {
			return;
		}
		System.out.format("%d ", p.getData());
		printList(p.getNext());
	}
	
	public static Node buildList(int capacity) {
		if (capacity == 0) {
			return null;
		}
		
		Node head = new Node(randomNumber(20));
		Node p = head;
		Node q = null;
		
		/*
		 * The head is already created
		 */
		for (int i = 0; i < capacity - 1; i++) {
			q = new Node(randomNumber(20));
			p.setNext(q);
			p = q;
		}
		
		return head;
	}
	
	public static int randomNumber(int n) {
		Random random = new Random();
		return 1 + random.nextInt(100) % n;
	}
}
