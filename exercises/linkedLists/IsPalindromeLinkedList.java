package linkedLists;

import utils.LinkedListUtils;
import utils.ListNode;

public class IsPalindromeLinkedList {

	public static void main(String[] args) {
		//ListNode head = LinkedListUtils.buildList(9);
		ListNode head = new ListNode(3);
		ListNode node1 = new ListNode(4);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		
		head.next(node1);
		node1.next(node2);
		node2.next(node3);
		
		LinkedListUtils.print(head);
		System.out.println(isPalindrome(head));
	}

	public static boolean isPalindrome(ListNode head) {
		ListNode p = head;
		ListNode q = head;
		int counter = 0;
		
		if (head == null) {
			return false;
		}
		
		if (head.next() == null) {
			return true;
		}
		
		if (head.next().next() == null) {
			return head.data() == head.next().data();
		}
		
		while(p != null) {
			if (counter >= 2) {
				q = q.next();
				counter = 0;
			}
			
			p = p.next();
			counter++;
		}
		
		if (counter % 2 == 0) {
			q = q.next();
		}
		
		System.out.println(q.data());
		
		ListNode halfOfList = counter % 2 == 1 ? q.next() : q;
		ListNode reversedListHead = null; 
		
		p = halfOfList;
		while (p != null) {
			ListNode newNode = new ListNode(p.data());
			if (reversedListHead == null) {
				reversedListHead = newNode;
			} else {
				newNode.next(reversedListHead);
				reversedListHead = newNode;
			}
			p = p.next();
		}
		
		p = head;
		q = reversedListHead;
		
		while(p != null && q != null) {
			if (p.data() != q.data()) {
				return false;
			}
			p = p.next();
			q = q.next();
		}
		
		return true;
	}
}
