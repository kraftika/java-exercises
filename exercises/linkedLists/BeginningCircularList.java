package linkedLists;

import utils.LinkedListUtils;
import utils.ListNode;

public class BeginningCircularList {

	public static void main(String[] args) {
		ListNode head = new ListNode(5);
		ListNode n1 = new ListNode(4);
		ListNode n2 = new ListNode(7);
		ListNode n3 = new ListNode(33);
		ListNode n4 = new ListNode(11);
		
		head.next(n1);
		n1.next(n2);
		n2.next(n3);
		n3.next(n4);
		n4.next(n1);
		
		LinkedListUtils.print(head);
		
	}
	
	public static ListNode findBeginningOfCircularList(ListNode head) {
		ListNode n = null;
		ListNode p = head;
		ListNode q = head;
		
		while(p != null) {
			q = head;
			
			while(q != p) {
				if (q == p) {
					return q;
				} 
				q = q.next();
			}
			p = p.next();
		}
		
		return null;
	}
}
