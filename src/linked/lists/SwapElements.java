package linked.lists;

public class SwapElements {
	public static void main(String[] args){
		int[] arrayOfInts = {11, 23, 1, 34, 76, 92, 21, 66, 14};
		
		Node head = buildList(arrayOfInts);
		searchNode(head, arrayOfInts[8]);
		printElements(head);
		head = swapElements(head, 11, 14);
		System.out.println();
		printElements(head);
	}
	
	public static Node swapElements(Node head, int x, int y){
		Node p = head;
		Node q = head;

		Node r = head;
		Node t = head;
		
		while (p != null){
			if (p.getData() == x) {
				break;
			}
			q = p;
			p = p.getNext();
		}
		
		while (r != null){
			if (r.getData() == y){
				break;
			}
			t = r;
			r = r.getNext();
		}
		
		if (p == null || q == null) {
			return head;
		}
		
		if ((p != head || q != head) && (p.getNext() != null || q.getNext() != null)) {
			t.setNext(p);
			q.setNext(r);
			Node s = r.getNext();
			r.setNext(p.getNext());
			p.setNext(s);
			return head;
		} 
		
		if ((p == head && r.getNext() != null) || 
				   (q == head && p.getNext() != null)) {
			t.setNext(p);
			p.setNext(r.getNext());
			r.setNext(t);
			head = r;
			return head;
		} 
		
		if ((p == head) && (r.getNext() == null) ||
				   (r == head) && (p.getNext() == null)) {
			r.setNext(p.getNext());
			t.setNext(p);
			p.setNext(null);
			head = r;
		}
		
		return head;
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