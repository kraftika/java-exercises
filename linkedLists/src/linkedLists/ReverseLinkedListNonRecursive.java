package linkedLists;

public class ReverseLinkedListNonRecursive {
	
	/**
	 * Summary, lessons learned:
	 * 	1. Pass through algorithm line by line. There are still issues when you
	 * validate. The source code doesn't run perfect.
	 * 	2. Name conventions. You tend to use improper method names and this leads you
	 * to confusion.
	 * 3. Please, check down the comments.
	 * 4. It is an improvement from previous exercise.
	 * 	4.1 You stayed longer and analyzed going through code lines to see if you
	 * are on the right track. So, you are not eager to jump on code editor.
	 * 	4.2 Still, it was a easy problem. Expect to get harder problems in the 
	 * interview sessions.  
	 */

	public static void main(String[] args) {
		Node head = generateList();
		listItems(head);
		System.out.println();
		Node reversedListHead = reverseList(head);
		listItems(reversedListHead);
	}
	
	public static Node generateList() {
		Node head = addNodeToLinkedList(null, 4);
		head = addNodeToLinkedList(head, 2);
		head = addNodeToLinkedList(head, 1);
		head = addNodeToLinkedList(head, 12);
		head = addNodeToLinkedList(head, 8);
		head = addNodeToLinkedList(head, 7);
		return head;
	}
	
	public static Node reverseList(Node head) {
		Node p = head; 
		Node q = null;
		while(p != null) {
			q = addNodeToReversedList(p, q);
			p = p.getNext();
		}
		
		return q;
	}
	
	public static Node addNodeToReversedList(Node p, Node head) {
		Node r = new Node(p.getData());
		
		if (head == null) {
			return r;
		}
		
		if (p == null) {
			return head;
		}
		
/**
 * 	1. You can optimize the code here. Don't do it before you know that the code
 * works perfectly.
 * 	2. Here was applied the fix after you wrote the code from the paper. You 
 * used p instead of head.
 */
		r = r.next(head);
		
		return r;
	}

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
}
