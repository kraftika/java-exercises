package linkedLists;

import java.util.Random;

public class PrintKLastElement {

	public static void main(String[] args) {
		Node head = buildList(4);
		printList(head);
		Node r = printKLElement(head, 3);
		System.out.println();
		
		if (r == null) {
			System.out.println("The element was not found");
		} else {
			System.out.println(r.getData());	
		}
	}
	
	public static Node printKLElement(Node head, int k) {
		int i = 0;
		Node p = head;
		Node q = null;
		
		while(p != null) {
			p = p.getNext();
			i++;
			if(i > k) {
				if (q == null) {
					q = head;
				}
				q = q.getNext();
			}
		}
		
		if (i == k) {
			return head;
		}
		
		return q;
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
