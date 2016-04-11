package linked.lists;

public class DeleteNode {
	public static void main(String[] args){
		int[] myArray = {1, 22, 43, 2, 45, 49, 12, 93, 4};

		Node head = buildList(myArray);
		printList(head);
		head = deleteNode(head, myArray[8]);
		System.out.println();
		printList(head);
	}
	
	public static Node buildList(int[] myArray){
		Node p = null;
		Node head = null;
		Node last = null;
		
		for(int k = 0; k < myArray.length; k++) {
			p = new Node(myArray[k]);
			
			if (head == null) {
				head = p;
			} else {
				last.setNext(p);
			}
			last = p;
		}
		
		return head;
	}
	
	public static void printList(Node head) {
		Node p = head;
		
		while(p != null) {
			System.out.format("%d ", p.getData());
			p = p.getNext();
		}
	}
	
	public static Node deleteNode(Node head, int element) {
		Node p = head;
		Node q = null;
		
		while(p.getNext() != null && p.getData() != element) {
			q = p;
			p = p.getNext();
		}
		
		if (head == p){
			head = p.getNext();
			p.setNext(null);
			return head;
		} else if (p.getNext() == null) {
			q.setNext(null);
			return head;
		} else {
			q.setNext(p.getNext());
			p.setNext(null);
			return head;
		}
	}
}
