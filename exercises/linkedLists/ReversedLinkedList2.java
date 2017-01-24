package linkedLists;

import utils.LinkedListUtils;
import utils.ListNode;

public class ReversedLinkedList2 {

	public static void main(String[] args) {
		ListNode head = LinkedListUtils.buildList(5);
		LinkedListUtils.print(head);
		
//		ListNode newHead = reverse2(head);
//		LinkedListUtils.print(newHead);

		ListNode newHead2 = reverse3(head, 2, 7);
		LinkedListUtils.print(newHead2);
	}
	
	public static ListNode reverse3(ListNode head, int m, int n) {
		ListNode q = null;
		ListNode p = head;
		ListNode nextNode = null;
		
		if (head == null) {
			return null;
		}
		
		if (m <= 0 || n <= 0 || m >= n) {
			return head;
		}
		
		int i = 0; 
		while (i < m - 1 && i < n - 1 && p != null) {
			q = p;
			p = p.next;
			i++;
		}
		
		ListNode previous = null;
		
		while(p != null && i < n) {
			nextNode = p.next;

			if (q.next != p) {
				previous.next = p.next;
				p.next = q.next;
				q.next = p;
			} else {
				previous = p;				
			}
			
			p = nextNode;
			i++;
		}
		
		return head;
	}

	public static ListNode reverse2(ListNode head) {
		ListNode newHead = null;
		ListNode p = head;
		ListNode nextNode = null;
		
		if (head == null) {
			return null;
		}
		
		while(p != null) {
			nextNode = p.next;
			
			if (newHead != null) {
				p.next = newHead;
			} else {
				p.next = null;
			}
			
			newHead = p;
			p = nextNode;
		}
		
		return newHead;
	}
}
