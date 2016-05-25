package linkedLists;

import utils.ListNode;

public class PrintLinkedList {
	public static void main(String...arg){
		int[][] array = {{1, 11, 32, 81, 45, 2, 34, 56, 90}, {1}, {1, 11}};
		
		for (int i = 0; i < array.length; i++) {
			System.out.format("List ----> %d \n", i + 1 );
			ListNode head = buildList(array[i]);
			printList(head);
			System.out.println();
			printReversedList(head);
			System.out.format("\nEnd ---- <\n");
		}
	}
	
	public static ListNode buildList(int[] a){
		ListNode head = null;
		ListNode p = null;
		ListNode last = null;
		
		for (int k = 0; k < a.length; k++){
			p = new ListNode(a[k]);
			
			if (head == null) {
				head = p;
			} else {
				last.next(p);
			}
			last = p;
		}
		
		return head;
	}
	
	public static void printList(ListNode p){
		if (p == null)  {
			return;
		}
		
		System.out.format("%d ", p.data());
		printList(p.next());
	}
	
	public static void printReversedList(ListNode p) {
		if (p == null) {
			return;
		}
		
		printReversedList(p.next());
		System.out.format("%d ", p.data());
	}	
}
