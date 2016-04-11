package linked.lists;

/**
 * Created by ipistol on 4/5/15.
 */
public class LinkedList {

  public Node addNode(Node head, int data) {
    if (head == null) {
      return new Node(data);
    }

    Node newNode = new Node(data);
    newNode.setNext(head);
    return newNode;
  }

  public void remove(Node head, int data){

  }

  public Node addNodeInSortedList(Node head, int data){
    if (data == 0) {
      return head;
    }

    if (head == null){
      return new Node(data);
    }

    Node p = head;
    while(p.getNext() != null && p.getData() < data){
    	p = p.getNext();
    }
    
    if (head == p) {
    	Node n = new Node(data);
    	n.setNext(p);
    	head = p;
    	return head;
    }
    
    if (p.getNext() == null) {
    	Node n = new Node(data);
    	p.setNext(n);
    	return head;
    } 
    
    if (p != head && p.getNext() != null){
    	Node n  = new Node(data);
    	n.setNext(p.getNext());
    	p.setNext(n);
    	return head;
    }
    
    return head;
  }
  
  public void printNodes(Node p){
	  if (p == null) {
		  return;
	  }
	  System.out.print(p.getData() + " ");
	  printNodes(p.getNext());
  }
}
