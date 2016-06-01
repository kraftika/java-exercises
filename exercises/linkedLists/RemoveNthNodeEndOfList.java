package linkedLists;

import utils.LinkedListUtils;
import utils.ListNode;

public class RemoveNthNodeEndOfList {

	public static void main(String[] args) {
		ListNode head = LinkedListUtils.buildList(3);
		LinkedListUtils.print(head);
		head = removeNthNode(head, 3);
		LinkedListUtils.print(head);
	}

	public static ListNode removeNthNode(ListNode head, int n) {
		if (n == 0) {
			return head;
		}
		
		if (head.next() == null && n == 1) {
			return null;
		}
		
		if (head.next() == null && n > 1) {
			return head;
		}
		
		ListNode p = head;
		ListNode kTh = head;
		ListNode lastNode = null;
		int counter = 0;
		
		while(p != null) {
			p = p.next();
			
			if (counter >= n) {
				lastNode = kTh;
				kTh = kTh.next();
			}
			counter++;
		}
		
		if (kTh == head && counter < n) {
			return head;
		}
		
		if (kTh == head && counter == n) {
			return kTh.next();
		}
		
		lastNode.next(kTh.next());
		kTh.next(null);
		
		return head;
	}
}
