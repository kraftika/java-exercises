package utils;

public class ListNode {
	private int data;
	private ListNode next;
	
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
