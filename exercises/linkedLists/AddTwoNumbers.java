package linkedLists;

import utils.LinkedListUtils;
import utils.ListNode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode head1 = LinkedListUtils.buildList(2);
		LinkedListUtils.print(head1);
		
		ListNode head2 = LinkedListUtils.buildList(4);
		LinkedListUtils.print(head2);

		ListNode head = addLinkedLists(head1, head2);
		LinkedListUtils.print(head);
	}
	
	public static ListNode addLinkedLists(ListNode head1, ListNode head2) {
		ListNode head = null;
		if (head1 == null && head2 == null) {
			return null;
		}
		
		if (head1 == null && head2 != null) {
			return head2;
		}
		
		if (head1 != null && head2 == null) {
			return head1;
		}
		
		ListNode p = head1;
		ListNode q = head2;
		ListNode r = null;
		int s = 0;
		ListNode node = null;
		int carriage = 0;
		
		while (p != null && q != null) {
			s = p.data() + q.data() + carriage;
			node = new ListNode(s % 10);
			carriage = s/10;
			
			if (head == null) {
				head = node;
			} else {
				r.next(node);
			}
			r = node;
			p = p.next();
			q = q.next();
		}
		
		while(p != null) {
			s = p.data() + carriage;
			node = new ListNode(s % 10);
			carriage = s/10;
			
			r.next(node);
			r = node;
			p = p.next();
		}
		
		while(q != null) {
			s = q.data() + carriage;
			node = new ListNode(s % 10);
			carriage = s/10;
			
			r.next(node);
			r = node;
			q = q.next();
		}
		
		if (p == null && q == null && carriage > 0) {
			ListNode n = new ListNode(carriage);
			r.next(n);
		}
		
		return head;
	}

}
