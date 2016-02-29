package linkedLists;

public class Node {
	private int data;
	private Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public int getData() {
		return this.data;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public Node next(Node head) {
		this.next = head;
		return this;
	}
}
