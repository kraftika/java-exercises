package linkedLists;

import java.util.HashSet;
import java.util.Set;

import utils.LinkedListUtils;
import utils.ListNode;

public class RemoveDuplicatesFromLinkedList {

	public static void main(String[] args) {
		ListNode head = LinkedListUtils.buildList(12);
		
		LinkedListUtils.print(head);
		head = removeDuplicates2(head);
		LinkedListUtils.print(head);
	}
	
	public static ListNode removeDuplicates2(ListNode head) {
		ListNode p = head, 
				 q = head, 
				 r = head;
		
		while(p != null) {
			r = head;
			while(r != p) {
				if (r.data() == p.data()) {
					q.next(p.next());
					p = q.next();
					break;
				} 
				r = r.next();	
			}
			if (r == p) {
				q = p;
				p = p.next();
			}
		}
		
		return head;
	}
	
	public static ListNode removeDuplicates(ListNode head) {
		Set<Integer> set = new HashSet<Integer>();
		
		ListNode p = head, q = head;
		
		while(p != null) {
			if (!set.contains(p.data())) {
				set.add(Integer.valueOf(p.data()));
				q = p;
				p = p.next();
			} else {
				if (p.next() == null) {
					q.next(null);
				} else {
					q.next(p.next());
				}
				p = q.next();
			}
		}
		
		return head;
	}
}
