package linkedLists;

import utils.LinkedListUtils;
import utils.ListNode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = LinkedListUtils.buildList(7);
		LinkedListUtils.print(head);
		ListNode nHead = reverseList(head);
		LinkedListUtils.print(nHead);
	}
	
	public static ListNode reverse2(ListNode head) {
		if (head == null) {
			return null;
		}
		
		if (head.next() == null) {
			return head;
		}
		
		ListNode p = head;
		ListNode q = null;
		ListNode newHead = null;
		
		while(p != null) {
			if (newHead == null) {
				newHead = p;
				newHead.next(null);	
			} else {
				newHead = p;
				newHead.next(q);
			}
			
			q = p;
			p = p.next();
		}
		
		return newHead;
	}
	
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        
        if (head.next() == null) {
            return head;
        }
        
        ListNode node = null;
        ListNode nHead = null;
        ListNode p = head;
        
        while(p != null) {
            if (nHead == null) {
                node = new ListNode(p.data());
                node.next(null);
                nHead = node;
            } else {
                node = new ListNode(p.data());
                node.next(nHead);
                nHead = node;
            }
            p = p.next();
        }
        
        return nHead;
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
	
//	public static void printList(Node p){
//		if (p == null)  {
//			return;
//		}
//		System.out.format("%d ", p.getData());
//		printList(p.getNext());
//	}
//	
//	public static Node buildList(int capacity) {
//		if (capacity == 0) {
//			return null;
//		}
//		
//		Node head = new Node(randomNumber(20));
//		Node p = head;
//		Node q = null;
//		
//		/*
//		 * The head is already created
//		 */
//		for (int i = 0; i < capacity - 1; i++) {
//			q = new Node(randomNumber(20));
//			p.setNext(q);
//			p = q;
//		}
//		
//		return head;
//	}
//	
//	public static int randomNumber(int n) {
//		Random random = new Random();
//		return 1 + random.nextInt(100) % n;
//	}
}
