package linkedLists;

import utils.LinkedListUtils;
import utils.ListNode;

public class RotateList {

	public static void main(String[] args) {
		ListNode head = LinkedListUtils.buildList(5);
		LinkedListUtils.print(head);
		head = rotatebyK(head, 10);
		LinkedListUtils.print(head);
	}
	
	public static ListNode rotatebyK(ListNode head, int k) {
		if (head == null) {
			return null;
		}
		
		if (k == 0) {
			return head;
		}
		
		ListNode p = head;
		ListNode kTh = head;
		ListNode q = head;
		ListNode lastNode = null;
		int counter = 0;
		
		while(p != null) {
            p = p.next();
            counter++;
		}
		
		k = k > counter ? k % counter : k;
		
		p = head;
	    counter = 0;
		
		while(p != null) {
			q = p;
			if (counter < k) {
				p = p.next();
				counter++;
			} else {
				p = p.next();
				lastNode = kTh;
				kTh = kTh.next();
			}
		}
		
		if (p == null && kTh == head) {
			return head;
		}
		
		q.next(head);
		lastNode.next(null);
		
		return kTh;
	}
}
