package LinkedLists;

public class SearchElement {
	public static void main(String[] args){
		int[] arrayOfInts = {11, 23, 1, 34, 76, 92, 21, 66, 14};
		
		Node head = buildList(arrayOfInts);
		printElements(head);
		System.out.println();
		searchNode(head, arrayOfInts[8]);
	}
	
	public static Node buildList(int[] elements){
		Node p = null;
		Node head = null;
		Node last = null;
		
		for(int k=0;k<elements.length;k++){
			p = new Node(elements[k]);
			
			if (head == null) {
				head = p;
			}
			else {
				last.setNext(p);
			}
			
			last = p;
		}
		
		return head;
	}
	
	public static void printElements(Node p){
		if (p == null) {
			return;
		}
		
		System.out.print(p.getData() + " ");
		printElements(p.getNext());
	}
	
	public static void searchNode(Node head, int data){
		Node p = head;
		int counter = 0;
		while (p != null && p.getData() != data){
			p = p.getNext();
			counter++;
		}
		
		System.out.println(String.format("Searched after %d and found it on index %d", data, counter));
	}
}