package linkedLists;

public class reverseLinkedList {
	
	public static Node addNodeToLinkedList(Node head, int data) {
		// Create the new node
		Node newNode = new Node(data);
		
		if (head != null) {
			head = newNode.next(head);			
		} else {
			head = newNode;			
		}
			
		return head;
	}
	
	public static void listItems(Node head) {
		if (head == null) {
			return;
		}
		
		System.out.print(head.getData() + " ");
		listItems(head.getNext());
	}
	
	public static void reverseListItems(Node head) {
		if (head == null) {
			return;
		}
		
		reverseListItems(head.getNext());
		System.out.print(head.getData() + " ");
	}
	
	public static void main(String[] args) {
		Node head = addNodeToLinkedList(null, 1);
		head = addNodeToLinkedList(head, 4);
		head = addNodeToLinkedList(head, 5);
		head = addNodeToLinkedList(head, 2);
		
		listItems(head);
		System.out.println();
		reverseListItems(head);
	}
}
