package linkedLists;

public class RemoveAllElementsForList {
	public static void main(String[] args) {
		Node head = buildList();
		
		head = removeElements(head, 2);
	}
	
	public static Node removeElements(Node head, int val) {
        if (head == null) {
            return null;
        }
        
        Node p = head;
        Node q = head;
        while(p != null) {
            if (p.getData() != val) { 
                if (p.getNext() != null) {
                    q = p;
                    p = p.getNext();
                } else {
                    return head;
                }
            } else {
                if (p == head) {
                    if (p.getNext() == null) {
                        return null;
                    }
                    else {
                        head = p.getNext();
                        q = p.getNext();
                        p.setNext(null);
                        p = head;
                    }
                } else if (p.getNext() == null) {
                    q.setNext(null);
                    return head;
                } else {
                    q.setNext(p.getNext());
                    p.setNext(null);
                    p = q;
                }
            }
        }
        
        return head;
    }
	
	public static Node buildList() {
		Node node = new Node(1);
		Node node1 = new Node(2);
		Node node2 = new Node(1);
		
		node.setNext(node1);
		node1.setNext(node2);
		
		return node;
	}
}
