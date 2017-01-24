package utils;

public class ListNode {
	public int data;
	public ListNode next;
	
	public ListNode(int d) {
		this.data = d;
		this.next = null;
	}
	
	public int data() {
		return this.data;
	}
	
	public ListNode next() {
		return this.next;
	}
	
	public void next(ListNode n) {
		this.next = n;
	}
}
