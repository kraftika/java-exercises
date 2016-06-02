package linkedLists;

import utils.LinkedListUtils;
import utils.ListNode;

public class HalfOfLinkedList {

	public static void main(String[] args) {
		ListNode head = LinkedListUtils.buildList(4);
		LinkedListUtils.print(head);
		head = halfOfList(head);
		LinkedListUtils.print(head);
	}
	
	public static ListNode halfOfList(ListNode head) {
		ListNode p = head;
		ListNode q = head;
		
		if (p.next().next() == null) {
			return p.next();
		}
		
		int counter = 0;
		
		while(p != null) {
			p = p.next();
			if (counter >= 2) {
				q = q.next();
				counter = 0;
			}
			counter++;
		}
		
		if (counter % 2 == 0) {
			q = q.next();
		}
		
		return q;
	}

}
