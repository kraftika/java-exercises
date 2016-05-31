package linkedLists;

import utils.LinkedListUtils;
import utils.ListNode;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		ListNode head = LinkedListUtils.buildList(8);
		LinkedListUtils.print(head);
		head = oddEvenList(head);
		LinkedListUtils.print(head);
	}
	
	public static ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return null;
		}
		
		if (head.next() == null || (head.next() != null && head.next().next() == null)) {
			return head;
		}
		
		ListNode p = head;
		ListNode q = head.next();
		ListNode r = head.next().next();
		ListNode nextR = null;
		
		while(r != null) {
			if (r.next() == null) {
				r.next(p.next());
				p.next(r);
				q.next(null);
				break;
			}
			
			if (r.next() != null) {
				nextR = r.next();	
			}
			
			q.next(r.next());
			r.next(p.next());
			p.next(r);
			
			p = p.next();
			q = q.next();
			
			if (q.next() == null) {
				break;
			} else {
				r = nextR.next();	
			}
		}
		
		return head;
	}
}
