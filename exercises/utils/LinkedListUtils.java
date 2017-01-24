package utils;

import java.util.Random;

public class LinkedListUtils {
	
	private static int maxLimit = 29; 

	public static void print(ListNode head){
		if (head == null)  {
			return;
		}
		
		ListNode p = head;
		while(p != null) {
			System.out.format("%d ", p.data());
			p = p.next();
		}
		
		System.out.println();
	}
	
	public static void printRec(ListNode head){
		if (head == null)  {
			return;
		}
		
		System.out.format("%d ", head.data());
		printRec(head.next());
	}
	
	public static ListNode buildList(int capacity) {
		if (capacity == 0) {
			return null;
		}
		
		ListNode head = new ListNode(randomNumber(maxLimit));
		ListNode p = head;
		ListNode q = null;
		
		/*
		 * The head is already created
		 */
		for (int i = 0; i < capacity - 1; i++) {
			q = new ListNode(randomNumber(maxLimit));
			p.next(q);
			p = q;
		}
		
		return head;
	}
	
	private static int randomNumber(int n) {
		Random random = new Random();
		return 1 + random.nextInt(100) % n;
	}
}
