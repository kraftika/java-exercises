package linked.lists;
/**
 * Created by ipistol on 4/5/15.
 */
public class SortedLinkedList {
  public static void main(String[] args){
    LinkedList list = new LinkedList();

    int[] array = new int[]{11,8,3,12,4,9};
    Node head = null;

    for (int k = 0;k < array.length; k++){
      head = addNodeInSortedList(head, array[k]);
    }

    list.printNodes(head);
  }
  
  public static Node addNodeInSortedList(Node head, int data){
    if (data == 0) {
      return head;
    }

    if (head == null){
      return new Node(data);
    }

    Node p = head;
    Node q = p;
    while(p.getNext() != null && p.getData() < data){
    	q = p;
    	p = p.getNext();
    }
    
    if (head == p) {
    	Node n = new Node(data);
    	n.setNext(p);
    	return n;
    }
    
    if (p.getNext() == null) {
    	Node n = new Node(data);
    	p.setNext(n);
    	return head;
    } 
    
    if (p != head && p.getNext() != null){
    	Node n  = new Node(data);
    	n.setNext(p);
    	q.setNext(n);
    	return head;
    }
    
    return head;
	}
}
