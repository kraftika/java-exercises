package utils;

public class StackNode {
	private int data;
	private StackNode next;
	
	public StackNode(int d) {
		this.data = d;
		this.next = null;
	}
	
	public int data() {
		return this.data;
	}
	
	public StackNode next() {
		return this.next;
	}
	
	public void next(StackNode n) {
		this.next = n;
	}
}
